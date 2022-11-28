package one.aiouyang.community.controller;

import one.aiouyang.community.mapper.UserMapper;
import one.aiouyang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: Andy
 * @version: 1.0
 * @Date: 2022/11/28 11:53
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List query() {
        List<User> list = userMapper.find();

        return list;
    }
}
