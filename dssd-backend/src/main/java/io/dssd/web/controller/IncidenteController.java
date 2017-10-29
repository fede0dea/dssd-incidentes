package io.dssd.web.controller;

import io.dssd.model.Expediente;
import io.dssd.model.Incidente;
import io.dssd.service.ExpedienteService;
import io.dssd.service.IncidenteService;
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
@RequestMapping("incidente")
public class IncidenteController {

    @Autowired
    private IncidenteService service;

    @GetMapping("{id}")
    public ResponseEntity<Incidente> getById(
        @PathVariable("id") Long id
    ) {
        Incidente incidente = service.getById(id);
        return new ResponseEntity<>(incidente, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Incidente> create(
        @RequestBody Incidente incidente,
        UriComponentsBuilder builder
    ) {
        incidente = service.save(incidente);
        return new ResponseEntity<>(incidente, HttpStatus.OK);
    }

}
