package me.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-02-23
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
@Component
public class StarterRunner implements ApplicationRunner {


    @Autowired
    Truthman truthman;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(truthman);

    }

}
