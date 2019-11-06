package com.webwork.service;

import com.webwork.POJO.User;

import java.util.List;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/26 20:10
 */
public interface UserService {
    public List<User> findAll(int index, int limit);//返回所有用户信息
    public int count();//查询用户总数
    public void adduser();//添加新用户
    public void deleteById(long id);//删除用户

}
