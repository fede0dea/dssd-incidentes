package io.dssd.web.controller;

import io.dssd.model.Usuario;
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
    public ResponseEntity<Usuario> getUserById(
        @PathVariable("id") Long id
    ) {
        Usuario user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Usuario> createUser(
        @RequestBody Usuario user,
        UriComponentsBuilder builder
    ) {
        user = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Usuario> updateUser(
        @PathVariable("id") Long id,
        @RequestBody Usuario update
    ) {
        Usuario usuario = userService.getUserById(id);
        usuario.setName(update.getName());
        userService.save(update);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

}
