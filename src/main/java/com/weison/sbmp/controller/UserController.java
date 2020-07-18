package com.weison.sbmp.controller;

import com.weison.sbmp.domain.User;
import com.weison.sbmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping("/Users")
    public Integer saveUser(@RequestBody User User) {
        Integer addNum = UserService.addUser(User);
        return addNum;
    }

    @DeleteMapping("/Users/{name}")
    public Integer deleteUserByName(@PathVariable String name) {
        Integer deleteNum = UserService.deleteUserByName(name);
        return deleteNum;
    }

    @PutMapping("/Users")
    public Integer updateUser(@RequestBody User User) {
        Integer updateNum = UserService.updateUser(User);
        return updateNum;
    }

    @GetMapping("/Users")
    public List<User> getUserListByAgeAndSexAndHobbies() {
        List<User> UserList = UserService.findUsers();
        return UserList;
    }

}