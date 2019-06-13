package me.mybatis;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-13
 * Copyright(©) 2019 by jaehyun.
 */
@Slf4j
@AllArgsConstructor
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class UserController {

    private final UserService userService;

    /**
     * 사용자 정보 조회
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity getApi(@PathVariable int id) {
        User user = userService.getUserInfo(id);
        log.debug("users {}", user);

        return ResponseEntity.ok(user);
    }

}

