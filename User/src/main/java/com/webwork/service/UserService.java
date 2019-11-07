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
    public int adduser(User user);//添加新用户
    public int deleteById(long id);//删除用户
    public int login(String name,String password);
    public User findById(long id);//通过id查询用户

}
