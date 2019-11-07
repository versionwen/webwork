package com.webwork.repository;

import com.webwork.POJO.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/24 20:45
 */
public interface USerMapper {
    public List<User> findAll(int index, int limit);
    public int count();
    public int adduser(User user);//添加新用户
    public int deleteById(long id);//删除用户
    public int login(String name,String password);
    public User findById(long id);//通过id查询用户
}
