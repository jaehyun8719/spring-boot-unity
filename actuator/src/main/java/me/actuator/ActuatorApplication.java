package me.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActuatorApplication {

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
