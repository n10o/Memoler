package com.memoler.web.login;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import com.memoler.dto.UserDto;

public class InfoAction {
    @Resource
    public UserDto userDto;

    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }
}
