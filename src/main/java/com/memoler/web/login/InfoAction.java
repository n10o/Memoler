package com.memoler.web.login;

import org.seasar.struts.annotation.Execute;

public class InfoAction {

    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }
}
