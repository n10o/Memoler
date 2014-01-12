package com.memoler.common;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

public class LoginConfirmInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = 1L;

    @Resource
    protected UserDataDto userDataDto;

    /**
     * 割り込ませる処理を記述
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation.proceed() : "/login/";
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
        return (userDataDto != null && userDataDto != null);
    }

}
