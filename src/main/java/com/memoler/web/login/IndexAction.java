package com.memoler.web.login;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import com.memoler.dto.UserDto;

public class IndexAction {
    @Resource
    public UserDto userDto;

    @Execute(validator = false)
    public String index() {
        System.out.println(userDto.userName);

        return "index.jsp";
    }

    @Execute(validator = false)
    @RemoveSession(name = "userDto")
    public String logout() {
        return "/?redirect=true";
    }

}
