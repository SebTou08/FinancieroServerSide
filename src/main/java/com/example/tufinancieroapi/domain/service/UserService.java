package com.example.tufinancieroapi.domain.service;

import com.example.tufinancieroapi.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> getAllUsers(Pageable pageable);
    User createUser(User user);

}
