package me.adminmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAdminServer
public class AdminmonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminmonitorApplication.class, args);
    }

}
