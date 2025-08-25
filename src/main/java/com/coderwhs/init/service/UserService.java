package com.coderwhs.init.service;

import com.coderwhs.init.entity.User;
import com.coderwhs.init.enums.StatusEnum;
import com.coderwhs.init.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public void createUser(String name, StatusEnum status) {
        User user = new User();
        user.setName(name);
        user.setStatus(status);
        userMapper.insert(user);
    }

    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }

    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    public void updateUser(Long id, String name, StatusEnum status) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setStatus(status);
        userMapper.updateById(user);
    }

    public void deleteUser(Long id) {
        userMapper.deleteById(id); // 自动逻辑删除
    }
}
