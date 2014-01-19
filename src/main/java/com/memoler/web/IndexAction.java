/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.memoler.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.memoler.dbflute.exbhv.InfoBhv;
import com.memoler.dbflute.exbhv.MemberBhv;
import com.memoler.dbflute.exentity.Info;
import com.memoler.dto.UserDto;
import com.memoler.logic.UserControlLogic;

/**
 * @author n10o
 */
// TODO リファクタしてdbflute系を外に追い出したい->パッケージでまとまってるから別にいい
public class IndexAction {
    @ActionForm
    @Resource
    protected MemberForm memberForm;

    @Resource
    protected MemberBhv memberBhv;

    @Resource
    protected InfoBhv infoBhv;

    @Resource
    public UserDto userDto;

    @Resource
    protected UserControlLogic userControlLogic; // userControlとかにするとCan not bind propertyエラーになる。

    public String mname;

    public List<Info> infoList;

    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }

    @Execute(validator = true, validate = "validateUniqueUser", input = "index.jsp")
    public String signup() {
        return "/?redirect=true";
    }

    @Execute(validator = true, validate = "validateAuth", input = "index.jsp")
    public String signin() {
        userDto.userName = memberForm.name;
        return "/login/?redirect=true";
    }

    public ActionMessages validateAuth() {
        ActionMessages errors = new ActionMessages();
        userDto.id = userControlLogic.doSignin(memberForm);
        if (userDto.id == null) {
            errors.add("authfail", new ActionMessage("認証情報が誤っています", false));
        }
        return errors;
    }

    public ActionMessages validateUniqueUser() {
        ActionMessages errors = new ActionMessages();
        if (userControlLogic.doSignup(memberForm) == false) {
            errors.add("notunique", new ActionMessage("既に指定されたユーザが存在しています", false));
        }
        return errors;
    }
}
