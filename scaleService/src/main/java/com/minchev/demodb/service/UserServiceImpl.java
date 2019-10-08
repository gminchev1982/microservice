package com.minchev.demodb.service;


import com.minchev.demodb.db.UserRepository;


public class UserServiceImpl {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
