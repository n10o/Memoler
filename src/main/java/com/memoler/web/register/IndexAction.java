package com.memoler.web.register;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.memoler.dbflute.exbhv.InfoBhv;
import com.memoler.dbflute.exentity.Info;
import com.memoler.dto.UserDto;

public class IndexAction {
    @Resource
    public UserDto userDto;

    @ActionForm
    @Resource
    public InfoForm infoForm;

    @Resource
    public InfoBhv infoBhv;

    public String name;

    public List<InfoBean> infoBeanList;

    @Execute(validator = false)
    public String index() {
        name = userDto.userName;
        return "index.jsp";
    }

    @Execute(validator = false)
    @RemoveSession(name = "userDto")
    public String logout() {
        return "/?redirect=true";
    }

    @Execute(validator = false)
    public String registerInfo() {
        Info info = new Info();
        info.setMemberId(userDto.id);
        info.setInfoName(infoForm.name);
        infoBhv.insert(info);

        return "/login/?redirect=true";
    }

}
