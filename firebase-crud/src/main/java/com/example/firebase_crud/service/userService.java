package com.example.firebasecrud.service;

import com.example.firebasecrud.model.User;
import com.example.firebasecrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String createUser(User user) throws ExecutionException, InterruptedException {
        return userRepository.createUser(user);
    }

    public User getUser(String id) throws ExecutionException, InterruptedException {
        return userRepository.getUser(id);
    }

    public String updateUser(User user) throws ExecutionException, InterruptedException {
        return userRepository.updateUser(user);
    }

    public String deleteUser(String id) throws ExecutionException, InterruptedException {
        return userRepository.deleteUser(id);
    }
}
