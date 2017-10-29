package io.dssd.web.controller;

import io.dssd.model.Cliente;
import io.dssd.model.Expediente;
import io.dssd.service.ClienteService;
import io.dssd.service.ExpedienteService;
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
@RequestMapping("expediente")
public class ExpedienteController {

    @Autowired
    private ExpedienteService service;

    @GetMapping("{id}")
    public ResponseEntity<Expediente> getById(
        @PathVariable("id") Long id
    ) {
        Expediente expediente = service.getById(id);
        return new ResponseEntity<>(expediente, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Expediente> create(
        @RequestBody Expediente expediente,
        UriComponentsBuilder builder
    ) {
        expediente = service.save(expediente);
        return new ResponseEntity<>(expediente, HttpStatus.OK);
    }

}
