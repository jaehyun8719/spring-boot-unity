package me.adminmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminmonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminmonitorApplication.class, args);
    }

}
