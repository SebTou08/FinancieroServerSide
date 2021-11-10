package com.example.tufinancieroapi.controller;

import com.example.tufinancieroapi.domain.model.User;
import com.example.tufinancieroapi.domain.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService _userService;


    @Operation(summary = "Get Users", description = "Get All User by Pages", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Users returned", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Users not found")
    })
    @GetMapping("/users")
    public Page<User> getAllCosts(Pageable pageable){
        Page<User> costPage = _userService.getAllUsers(pageable);
        List<User> resources = new ArrayList<>(costPage.getContent());
        return new PageImpl<>(resources, pageable, resources.size());
    }


    @Operation(summary = "Add Cost", description = "Create new user", tags = {"Users"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User created", content = @Content(mediaType = "application/json")),
    })
    @PostMapping("/user")
    public User createCost(@Valid @RequestBody User user){
        User newUser = _userService.createUser(user);
        return newUser;
    }
}
