package me.auto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

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
@Getter @Setter
@ConfigurationProperties("truthman")
public class TruthmanProperties {

    private String name;

    private int howLong;
}
