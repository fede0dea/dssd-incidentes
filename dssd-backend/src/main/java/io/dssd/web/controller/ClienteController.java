package io.dssd.web.controller;

import io.dssd.model.Cliente;
import io.dssd.model.Usuario;
import io.dssd.service.ClienteService;
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
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("{id}")
    public ResponseEntity<Cliente> getById(
        @PathVariable("id") Long id
    ) {
        Cliente cliente = service.getById(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Cliente> create(
        @RequestBody Cliente cliente,
        UriComponentsBuilder builder
    ) {
        cliente = service.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

}
