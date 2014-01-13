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

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.memoler.dbflute.cbean.MemberCB;
import com.memoler.dbflute.exbhv.MemberBhv;
import com.memoler.dbflute.exentity.Member;
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
    public UserDto userDto;

    @Resource
    protected UserControlLogic userControlLogic; // userControlとかにするとCan not bind propertyエラーになる。

    public String mname;

    @Execute(validator = false)
    public String index() {
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal((long) 1);
        Member entity = memberBhv.selectEntity(cb);
        if (entity == null) {
            return "index.jsp";
        }
        System.out.println(entity.getName());
        mname = entity.getName();

        return "index.jsp";
    }

    @Execute(validator = false)
    public String signup() {
        userControlLogic.doSignup(memberForm);
        return "/?redirect=true";
    }

    @Execute(validator = false)
    public String signin() {
        if (userControlLogic.doSignin(memberForm) == true) {
            userDto.userName = memberForm.name;
            return "/login/";
        }
        return "/?redirect=true";
    }

    @Execute(validator = false)
    @RemoveSession(name = "userDto")
    public String logout() {
        return "/?redirect=true";
    }
}
