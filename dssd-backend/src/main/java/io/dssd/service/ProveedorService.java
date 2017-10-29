package io.dssd.service;

import io.dssd.model.Proveedor;
import io.dssd.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    public Proveedor getById(Long id) {
        return repository.getById(id);
    }

}
