package com.weison.sbmp.service;

import com.weison.sbmp.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void insert() {
        User user = new User()
                .setAge(10)
                .setName("Even")
                .setPassword("438")
                .setEmail("fuck@fuck.com");

        Integer integer = userService.addUser(user);
        Assertions.assertEquals(1, integer);
    }
}
