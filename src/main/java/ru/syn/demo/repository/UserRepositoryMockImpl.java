package ru.syn.demo.repository;

public class UserRepositoryMockImpl extends UserRepository {
    @Override
    public String getUser(){
        return "Vova";
    }
}
