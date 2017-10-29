package io.dssd.web.controller;

import io.dssd.model.Incidente;
import io.dssd.model.Objeto;
import io.dssd.service.IncidenteService;
import io.dssd.service.ObjetoService;
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
@RequestMapping("objeto")
public class ObjetoController {

    @Autowired
    private ObjetoService service;

    @GetMapping("{id}")
    public ResponseEntity<Objeto> getById(
        @PathVariable("id") Long id
    ) {
        Objeto objeto = service.getById(id);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Objeto> create(
        @RequestBody Objeto objeto,
        UriComponentsBuilder builder
    ) {
        objeto = service.save(objeto);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

}
