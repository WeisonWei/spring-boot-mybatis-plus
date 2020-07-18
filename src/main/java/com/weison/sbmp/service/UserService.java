package com.weison.sbmp.service;

import com.weison.sbmp.domain.User;
import com.weison.sbmp.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public Integer addUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }

    public Integer deleteUserByName(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        int i = userMapper.deleteByMap(map);
        return i;
    }

    public Integer updateUser(User user) {
        return userMapper.updateById(user);
    }

    public List<User> findUsers() {
        return userMapper.selectList(null);
    }
}