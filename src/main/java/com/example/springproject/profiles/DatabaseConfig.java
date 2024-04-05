package com.example.springproject.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfig {

    @Bean
    @Profile("dev")
    public DatabaseConnectionProvider developmentDatabaseConnectionProvider(@Value("${spring.datasource.url}") String url)  {
        return new DatabaseConnectionProvider(url);
    }

    @Bean
    @Profile("production")
    public DatabaseConnectionProvider productionDatabaseConnectionProvider(@Value("${spring.datasource.url}") String url)  {
        return new DatabaseConnectionProvider(url);
    }
}
