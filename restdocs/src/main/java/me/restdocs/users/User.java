package me.restdocs.users;

import lombok.*;

import javax.validation.constraints.NotEmpty;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-05-29
 * Copyright(©) 2019 by jaehyun.
 */
@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
public class User {

    @NotEmpty
    private String id;

    private String email;

    private String address;

}
