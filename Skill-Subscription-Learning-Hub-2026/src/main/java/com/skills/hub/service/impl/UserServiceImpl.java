package com.skills.hub.service.impl;

import com.skills.hub.model.User;
import com.skills.hub.repository.UserRepository;
import com.skills.hub.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User registerUser(User user) {

        // check if email already exists in DB
        Optional<User> existing = userRepo.findByEmail(user.getEmail());

        // if email found, stop and return null
        if (existing.isPresent()) {
            return null;
        }

        // email is new, save user and return
        return userRepo.save(user);
    }

    @Override
    public User login(String email, String password) {

        // find user by email
        Optional<User> user = userRepo.findByEmail(email);

        // if no user found, return null
        if (!user.isPresent()) {
            return null;
        }

        // check if password matches
        if (user.get().getPassword().equals(password)) {
            return user.get();
        }

        // password wrong, return null
        return null;
    }
}