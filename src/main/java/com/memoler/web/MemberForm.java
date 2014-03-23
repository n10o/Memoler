package com.memoler.web;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class MemberForm {
    @Required
    public String name;
    @Required
    @Maxlength(maxlength = 10)
    public String password;
}
