package io.dssd.web.controller;

import io.dssd.model.User;
import io.dssd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by federico on 11/10/17.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(
        @PathVariable("id") Long id
    ) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<User> createUser(
        @RequestBody User user,
        UriComponentsBuilder builder
    ) {
        user = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
