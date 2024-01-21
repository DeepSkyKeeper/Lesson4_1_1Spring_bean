package ru.syn.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.syn.demo.repository.UserRepository;
import ru.syn.demo.repository.UserRepositoryFtpImpl;
import ru.syn.demo.repository.UserRepositoryRealImpl;
import ru.syn.demo.repository.UserRepositoryS3Impl;

@Configuration
public class DemoConfig {

    @Bean()
    UserRepository getUserRepo() {
        return new UserRepositoryRealImpl();
    }

    @Bean(name = "s3")
    UserRepository gets3Storage() {
        return new UserRepositoryS3Impl();
    }
    @Bean(name = "ftp")
    UserRepository getsFtpStorage() {
        return new UserRepositoryFtpImpl();
    }
}
