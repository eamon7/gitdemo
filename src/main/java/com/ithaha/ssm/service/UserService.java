package com.ithaha.ssm.service;

import com.ithaha.ssm.mapper.UserMapper;
import com.ithaha.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
