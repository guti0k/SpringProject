package com.example.springproject;

import com.example.springproject.profiles.DatabaseConnectionProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);

//        SpringApplication application = new SpringApplication(SpringApplication.class);
//        ConfigurableEnvironment configurableEnvironment = new StandardEnvironment();
//
//        configurableEnvironment.setActiveProfiles("dev");
//        application.setEnvironment(configurableEnvironment);
//
//        ConfigurableApplicationContext context = application.run(args);
//        DatabaseConnectionProvider databaseConnectionProvider = context.getBean(DatabaseConnectionProvider.class);
//        System.out.println(databaseConnectionProvider);
    }

}
