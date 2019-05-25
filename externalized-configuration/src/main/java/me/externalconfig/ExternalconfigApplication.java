package me.externalconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalconfigApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ExternalconfigApplication.class);
        app.run();
    }
}
