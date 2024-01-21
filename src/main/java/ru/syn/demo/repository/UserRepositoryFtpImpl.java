package ru.syn.demo.repository;

public class UserRepositoryFtpImpl extends UserRepository {
    @Override
    public String upload(Object o){
        return "ftp file";
    }
}
