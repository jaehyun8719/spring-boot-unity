package me.mybatis;

import lombok.*;

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
@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class User {

    private int id;
    private String name;

}
