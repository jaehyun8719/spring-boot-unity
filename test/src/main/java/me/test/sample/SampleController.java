package me.test.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-03-03
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService sampleServer;

    @GetMapping("/hello")
    public String hello() {

        logger.info("abc");
        System.out.println("skip");

        return "hello " +  sampleServer.getName();
    }

}
