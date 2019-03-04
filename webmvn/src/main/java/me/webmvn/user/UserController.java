package me.webmvn.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-03-04
 * Copyright(©) 2019 by jaehyun.
 */
@RestController
public class UserController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return user;
    }
}
