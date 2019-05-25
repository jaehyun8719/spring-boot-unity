package me.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Configuration
@EnableConfigurationProperties(TruthmanProperties.class)
public class TruthConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Truthman truthman(TruthmanProperties truthmanProperties) {
        Truthman truthman = new Truthman();
        truthman.setName(truthmanProperties.getName());
        truthman.setHowLong(truthmanProperties.getHowLong());
        return truthman;
    }

}
