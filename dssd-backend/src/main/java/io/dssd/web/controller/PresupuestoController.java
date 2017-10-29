package io.dssd.web.controller;

import io.dssd.model.Objeto;
import io.dssd.model.Presupuesto;
import io.dssd.service.ObjetoService;
import io.dssd.service.PresupuestoService;
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
public class PresupuestoController {

    @Autowired
    private PresupuestoService service;

    @GetMapping("{id}")
    public ResponseEntity<Presupuesto> getById(
        @PathVariable("id") Long id
    ) {
        Presupuesto presupuesto = service.getById(id);
        return new ResponseEntity<>(presupuesto, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Presupuesto> create(
        @RequestBody Presupuesto presupuesto,
        UriComponentsBuilder builder
    ) {
        presupuesto = service.save(presupuesto);
        return new ResponseEntity<>(presupuesto, HttpStatus.OK);
    }

}
