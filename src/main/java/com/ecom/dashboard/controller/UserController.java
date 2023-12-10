package com.ecom.dashboard.controller;

import com.ecom.dashboard.model.Login;
import com.ecom.dashboard.model.User;
import com.ecom.dashboard.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {

        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/user/login")
    public ResponseEntity<Boolean> addUser(@RequestBody Login login) {

        return new ResponseEntity<>(userService.loginUser(login), HttpStatus.OK);
    }
}
