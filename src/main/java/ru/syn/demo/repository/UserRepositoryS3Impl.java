package ru.syn.demo.repository;

public class UserRepositoryS3Impl extends UserRepository {
    @Override
    public String upload(Object o){
        return "S3 file";
    }
}
