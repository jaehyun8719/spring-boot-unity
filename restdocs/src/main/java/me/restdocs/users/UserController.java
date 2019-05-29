package me.restdocs.users;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-05-29
 * Copyright(©) 2019 by jaehyun.
 */
@RestController
@RequestMapping(value = "/api/users", produces = MediaTypes.HAL_JSON_UTF8_VALUE)
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable String id) {
        User user = User.builder()
                .id(id)
                .email(id + "@mail.com")
                .address("Seoul")
                .build();

        UserResource userResource = new UserResource(user);
        userResource.add(new Link("docs/index.html#resources-user-get").withRel("profile"));

        return ResponseEntity.ok(userResource);
    }
}
