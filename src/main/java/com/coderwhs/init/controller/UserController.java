package com.coderwhs.init.controller;

import com.coderwhs.init.enums.StatusEnum;
import com.coderwhs.init.service.UserService;
import com.coderwhs.init.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 新增用户
     * curl -X POST "http://localhost:8101/users?name=Tom&status=ENABLE"
     */
    @PostMapping
    public String createUser(@RequestParam String name, @RequestParam StatusEnum status) {
        userService.createUser(name, status);
        return "新增成功";
    }

    /**
     * 查询所有未逻辑删除的用户
     * curl "http://localhost:8101/users"
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 根据ID查询单个用户
     * curl "http://localhost:8101/users/1"
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /**
     * 更新用户
     * curl -X PUT "http://localhost:8101/users/1?name=TomNew&status=DISABLE"
     */
    @PutMapping("/{id}")
    public String updateUser(
            @PathVariable Long id,
            @RequestParam String name,
            @RequestParam StatusEnum status) {
        userService.updateUser(id, name, status);
        return "更新成功";
    }

    /**
     * 逻辑删除用户
     * curl -X DELETE "http://localhost:8101/users/1"
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "删除成功";
    }
}
