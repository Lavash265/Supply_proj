package org.example.supplyes_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class SupplyesProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplyesProjectApplication.class, args);
    }
}
