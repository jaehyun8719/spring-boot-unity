package me.restdocs.users;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-05-29
 * Copyright(©) 2019 by jaehyun.
 */
public class UserResource extends Resource<User> {

    public UserResource(User user, Link... links) {
        super(user, links);
        add(linkTo(UserController.class).slash(user.getId()).withSelfRel());
    }
}
