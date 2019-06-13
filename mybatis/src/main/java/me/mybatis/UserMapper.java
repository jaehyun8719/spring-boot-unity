package me.mybatis;

import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface UserMapper {

    User getUserInfo(int id);

}

