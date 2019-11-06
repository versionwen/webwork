package com.webwork.service.Serviceimpl;

import com.webwork.POJO.User;
import com.webwork.repository.USerMapper;
import com.webwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/26 20:12
 */
@Service
public class UserImpl implements UserService {
    @Autowired
    private USerMapper uSerMapper;
    public List<User> findAll(int index, int limit){
        return uSerMapper.findAll(index,limit);
    }
    public int count(){
        return uSerMapper.count();
    }
    public void adduser(){
        uSerMapper.adduser();
    }//添加新用户
    public void deleteById(long id){
        uSerMapper.deleteById(id);
    }//删除用户
}
