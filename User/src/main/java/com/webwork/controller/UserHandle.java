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
        System.out.println(user.getAddress()+"#############\n");
        try{
            if(userService.adduser(user)==1) {
                res.put("msg", 200);
            }
            else{
                res.put("msg",500);
            }
        }catch (Exception e){
            System.out.println(e);
            res.put("msg",500);
        }
        return res;
    }
    @DeleteMapping("/deleteById/{id}")
    public HashMap<String,Integer> DeleteMapping(@PathVariable("id") long id){
        HashMap<String,Integer>res=new HashMap<>();
        try {
            if(userService.deleteById(id)==1) {
                res.put("msg", 200);
            }
            else{
                res.put("msg",500);
            }
        }catch (Exception e){
            res.put("msg",500);
        }
        return res;
    }
    @PostMapping("/login/{name}/{password}")
    public HashMap<String,Integer> login(@PathVariable("name") String name,@PathVariable("password") String password){
        HashMap<String,Integer>res=new HashMap<>();
        String passwordnew = DigestUtil.md5Hex(password);
        try {
            if(userService.login(name, passwordnew)==1) {
                res.put("msg", 200);
            }
            else{
                System.out.println("**************\n");
                res.put("msg",500);
            }
        }catch (Exception e){
            System.out.println(e);
            res.put("msg",500);
        }
        return res;
    }
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        User user=userService.findById(id);
        System.out.println("##############\n"+user.getPassword());
        return user;
    }
}
