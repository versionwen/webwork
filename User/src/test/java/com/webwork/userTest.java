package com.webwork;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.webwork.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = User.class)
public class userTest {
    //@Autowired
  //  private UserService userService;
    @Test
    public void test(){
        System.out.println("##############\n");
    }

}
