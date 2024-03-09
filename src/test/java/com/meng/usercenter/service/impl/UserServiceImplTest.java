package com.meng.usercenter.service.impl;

import java.util.Date;

import com.meng.usercenter.model.domain.User;
import com.meng.usercenter.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("Shier");
        user.setUserAccount("meng");
        user.setAvatarUrl("https://profile.csdnimg.cn/2/B/1/1_qq_56098191");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("888888888");
        user.setEmail("66666666@qq.com");
        user.setUserCode("002");
        user.setPlanetCode("001");

        boolean result = userService.save(user);
        System.out.println("新增用户ID：" + user.getId());
        Assert.assertTrue(result);


    }

//    @Test
//    void userRegister() {
//
//        // 测试非空
//        String userAccount = "xiaoshier";
//        String userPassword = "";
//        String checkPassword = "12345678";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        // 测试账户长度小于4
//        userAccount = "shi";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        // 测试密码小于6位
//        userAccount = "xiaoshier";
//        userPassword = "1234";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        // 测试特殊字符
//        userAccount = "shi@";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        // 测试密码和校验密码不相同
//        userAccount = "xiaoshier";
//        checkPassword = "123457899";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        // 测试账号不重复
//        userAccount = "Shier";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //插入数据
//        userAccount = "xiaoshier";
//        userPassword = "123456789";
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//    }
}