package com.meng.usercenter.service;

import com.meng.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author juanmeng
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword   用户密码
     * @param checkPassword   校验密码
     * @return 用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request
     * @return User
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    int userLogout(HttpServletRequest request);

    User getSafetyUser(User originUser);
}
