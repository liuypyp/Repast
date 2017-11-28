package com.sumoon.pepast.model;

import java.util.Date;
import java.util.Set;

/**
 * Created by Liuyp on 2017/11/27.
 */
public class User {

    private Long pkUser;

    private String userName;

    private String password;

    private Date createTime;

    private String idNumber;

    private String phone;

    /** 用户类型 */
    private String userType;

    /** 用户状态 */
    private String userStatus;

    /** 用户级别 */
    private String userLevel;

    private String email;

    /** 性别 */
    private String sex;

    /** 是否删除 */
    private Boolean isDelete;

    /***/
    private Date birthday;

    private String weChat;

    private Integer version;

    /** 所属餐馆  */
    private Set<Restaurant> restaurants;








}
