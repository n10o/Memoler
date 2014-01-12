package com.memoler.common;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserDataDto implements Serializable {
    private static final long serialVerionUID = 1L;

    public String userID;
}
