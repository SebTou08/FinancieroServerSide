package com.example.tufinancieroapi.service;

import com.example.tufinancieroapi.domain.model.User;
import com.example.tufinancieroapi.domain.repository.UserRepository;
import com.example.tufinancieroapi.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository _userRepo;


    @Override
    public Page<User> getAllUsers(Pageable pageable) {
        Page<User> users = _userRepo.findAll(pageable);
        return users;
    }

    @Override
    public User createUser(User user) {
        return _userRepo.save(user);
    }
}
