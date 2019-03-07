package me.webmvn.user;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user")
    public String user() {
        return "hello";
    }

    @PostMapping("/user/create")
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("/hello")
    public @ResponseBody String hello() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    public AppError SampleError(SampleException e) {

        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("why?");

        return appError;
    }
}
