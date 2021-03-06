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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.memoler.dbflute.cbean.InfoCB;
import com.memoler.dbflute.exbhv.InfoBhv;
import com.memoler.dbflute.exbhv.MemberBhv;
import com.memoler.dbflute.exentity.Info;
import com.memoler.dto.UserDto;
import com.memoler.logic.UserControlLogic;
import com.memoler.web.login.InfoBean;

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

    public String name; //ユーザ名表示用

    public List<InfoBean> infoBeanList;

    @Execute(validator = false)
    public String index() {
        if (userDto.id == null) {
            return "login.jsp";
        }
        name = userDto.userName;
        displayInfo();
        return "index.jsp";
    }

    private void displayInfo() {
        InfoCB cb = new InfoCB();
        cb.query().setMemberId_Equal(userDto.id);
        cb.query().addOrderBy_InfoId_Desc();
        List<Info> infoList = infoBhv.selectList(cb);

        infoBeanList = new ArrayList<InfoBean>();
        for (Info info : infoList) {
            InfoBean bean = new InfoBean();
            bean.infoName = info.getInfoName();
            bean.infoId = info.getInfoId();
            System.out.println(bean.infoName);
            System.out.println(bean.infoId);
            infoBeanList.add(bean);
            System.out.println("hoge");
        }

    }

    @Execute(validator = false)
    @RemoveSession(name = "userDto")
    public String logout() {
        return "/?redirect=true";
    }

    @Execute(validator = true, validate = "validateUniqueUser", input = "index.jsp")
    public String signup() {
        return "/?redirect=true";
    }

    @Execute(validator = true, validate = "validateAuth", input = "index.jsp")
    public String signin() {
        userDto.userName = memberForm.name;
        return "/?redirect=true";
    }

    ///////////// ERROR VALIDATION
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
