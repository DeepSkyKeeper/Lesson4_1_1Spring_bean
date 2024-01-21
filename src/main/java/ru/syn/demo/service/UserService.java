package ru.syn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.syn.demo.repository.UserRepository;

@Component
public class UserService {

//    @Autowired
//    UserRepository repository;

    @Autowired
    @Qualifier("ftp")
    UserRepository ftpRepository;

    @Autowired
    @Qualifier("s3")
    UserRepository s3Repository;

//    public boolean isAuth(String newUser) {
//        var remoteUser = repository.getUser();
//        return newUser.equals(remoteUser);
//    }

    public boolean upload(String newUser) {
        var ftpUpload = ftpRepository.upload(newUser);
        var s3Upload = s3Repository.upload(newUser);
        System.out.println(ftpUpload);
        System.out.println(s3Upload);

        return true;
    }
}
