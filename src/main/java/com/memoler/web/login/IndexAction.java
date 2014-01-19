package com.memoler.web.login;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.memoler.dbflute.cbean.InfoCB;
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

    @Execute(validator = false)
    public String registerInfo() {
        Info info = new Info();
        info.setMemberId(userDto.id);
        info.setInfoName(infoForm.name);
        infoBhv.insert(info);

        return "/login/?redirect=true";
    }

}
