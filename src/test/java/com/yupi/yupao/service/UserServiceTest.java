package com.yupi.yupao.service;
import com.yupi.yupao.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @Author: kui2331
 * @Date: 2021/11/22
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("kui2331");
        user.setUserAccount("123456");
        user.setAvatarUrl("https://www.baidu.com/img/flexible/logo/pc/result.png");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("12345678901");
        user.setEmail("123456@qq.com");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);

        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);     //断言是否保存成功
    }
    /*断言的语法通常类似于 assert 条件 : 错误信息;，
    其中 条件 是一个布尔表达式，错误信息 是当断言失败时提供的信息。
    如果条件为真，则程序正常执行；
    如果条件为假，则程序会抛出一个断言错误（AssertionError），
    并在某些情况下停止执行，以便开发者能够找到并修复问题。
     */
    @Test
    void userRegister() {
        // 注册用户
        String userAccount = "2";
        String userPassword = "123456";
        String checkPassword = "123456";
        String planetCode = "2";

    }

    /**
     * 获取tag
     */
    @Test
    void testSearchUsersByTags() {
        List<String> tagNameList = Arrays.asList("java", "python");
        List<User> userList = userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(userList);
    }
}
