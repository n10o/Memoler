package com.memoler.web.login;

import org.seasar.struts.annotation.Execute;

public class TestAction {

    @Execute(validator = false)
    public String index() {

        return "index.jsp";
    }

}
