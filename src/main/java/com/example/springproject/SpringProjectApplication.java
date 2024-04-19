package com.example.springproject;

import com.example.springproject.event.ObjectPublisher;
import com.example.springproject.model.User;
import com.example.springproject.profiles.DatabaseConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

import java.time.LocalDate;

@SpringBootApplication
public class SpringProjectApplication {

    @Autowired
    private ObjectPublisher objectPublisher;

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

    @Bean
    CommandLineRunner run() {
        return args -> {
            System.out.println("cv1");
            System.out.println("cv2");

            objectPublisher.sendMessage(new User(null, "nguyenduyquyen0017@gmail.com", "123456", "Duy Quyền", "098701074"));

            System.out.println("Sự kiện kết thúc.");
        };
    }

}
