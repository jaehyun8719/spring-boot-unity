package me.init;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-02-27
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
public class SampleLisner implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {

        System.out.println("=====================");
        System.out.println("Application Start");
        System.out.println("=====================");
    }
}
