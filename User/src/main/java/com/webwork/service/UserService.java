package com.webwork.service;

import com.webwork.POJO.User;

import java.util.List;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/26 20:10
 */
public interface UserService {
    public List<User> findAll(int index, int limit);
}
