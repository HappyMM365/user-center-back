package com.meng.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author mengy
 */
@Data
public class UserRegisterRequest implements Serializable {


    private static final long serialVersionUID = 2668549655516966350L;


    private String userAccount;

    private String userPassword;

    private String checkPassword;

    /**
     * 星球编号
     */
    private String planetCode;


}
