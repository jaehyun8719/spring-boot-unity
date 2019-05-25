package me.externalconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * Date: 2019-03-01
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
@Component
public class ExternalRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(ExternalRunner.class);

    @Autowired
    JaehyunProperties jaehyunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("=======================");
        logger.debug(jaehyunProperties.getFullName());
        logger.debug("=======================");
    }
}
