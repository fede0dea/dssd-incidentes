package io.dssd.web.controller;

import io.dssd.model.Presupuesto;
import io.dssd.model.Proveedor;
import io.dssd.service.PresupuestoService;
import io.dssd.service.ProveedorService;
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
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping("{id}")
    public ResponseEntity<Proveedor> getById(
        @PathVariable("id") Long id
    ) {
        Proveedor proveedor = service.getById(id);
        return new ResponseEntity<>(proveedor, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Proveedor> create(
        @RequestBody Proveedor proveedor,
        UriComponentsBuilder builder
    ) {
        proveedor = service.save(proveedor);
        return new ResponseEntity<>(proveedor, HttpStatus.OK);
    }

}
