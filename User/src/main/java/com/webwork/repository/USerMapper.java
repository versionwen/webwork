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
    public void adduser();//添加新用户
    public void deleteById(long id);//删除用户
}
