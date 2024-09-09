package org.lim.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.lim.entity.UserEntity;
import org.lim.service.UserService;

@DubboService
public class UserServiceImpl implements UserService {
    /**
     * @param entity
     * @return
     */
    @Override
    public UserEntity queryUser(UserEntity entity) {
        return entity;
    }
}
