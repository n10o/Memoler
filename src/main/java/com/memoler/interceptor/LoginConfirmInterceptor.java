package com.memoler.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import com.memoler.dto.UserDto;

public class LoginConfirmInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = 1L;

    @Resource
    protected UserDto userDto;

    /**
     * 割り込ませる処理を記述
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("INTO INTERCEPTER ==============");
        return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation.proceed() : "/?redirect=true";
    }

    /**
     * 実行されたActionに@Executeがついているかどうか
     * @param invocation
     * @return
     */
    private boolean isExecuteMethod(MethodInvocation invocation) {
        return invocation.getMethod().isAnnotationPresent(Execute.class);
    }

    private boolean isLoggedIn() {
        return (userDto != null && userDto.userName != null);
    }

}
