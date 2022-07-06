package com.sagi.dates.controllers;

import com.sagi.dates.dto.UserDto;
import com.sagi.dates.logic.UsersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersLogic usersLogic;

    @PostMapping
    public long createCompany(@RequestBody UserDto userDto){
        return usersLogic.createUser(userDto);
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") long id){
        return usersLogic.getUserById(id);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDto userDto){
        usersLogic.updateUser(userDto);
    }

    @DeleteMapping
    public void deleteUserById(@PathVariable("id") long id){
        usersLogic.deleteUserById(id);
    }
}
