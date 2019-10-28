package com.webwork.controller;

import com.webwork.POJO.User;
import com.webwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/26 20:06
 */
@RestController
@RequestMapping("/user")
public class UserHandle {
    @Autowired
    UserService userService;
    @GetMapping("/findAll/{page}/{limit}")
    public List<User> findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        List<User> user=userService.findAll(page,limit);
        return user;
    }

}
