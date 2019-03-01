package me.init;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(InitApplication.class);
        app.addListeners(new SampleListener());
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
