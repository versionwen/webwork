package com.webwork.controller;
import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.webwork.POJO.User;
import com.webwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
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
    @GetMapping("/count")
    public HashMap<String, Integer> count(){
        int count=userService.count();
        HashMap<String,Integer>usercount=new HashMap<>();
        usercount.put("count",count);
        return usercount;
    }
    @PostMapping("/add")
    public HashMap<String,Integer> save(@RequestBody User user){
        Date date= DateUtil.date(Calendar.getInstance());
        String md5Hex1 = DigestUtil.md5Hex(user.getPassword());
        user.setRegisterdate(date);
        user.setPassword(md5Hex1);
        HashMap<String,Integer>res=new HashMap<>();
        try{
            userService.adduser();
            res.put("msg",200);

        }catch (Exception e){
            res.put("msg",500);
        }
        return res;
    }
    @DeleteMapping("/deleteById/{id}")
    public HashMap<String,Integer> DeleteMapping(@PathVariable("id") long id){
        HashMap<String,Integer>res=new HashMap<>();
        try {
            userService.deleteById(id);
            res.put("msg",200);
        }catch (Exception e){
            res.put("msg",500);
        }
        return res;
    }
}
