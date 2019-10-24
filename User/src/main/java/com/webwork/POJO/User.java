package com.webwork.POJO;

import lombok.Data;

import java.util.Date;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/24 20:56
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
