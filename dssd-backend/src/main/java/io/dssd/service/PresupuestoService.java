package io.dssd.service;

import io.dssd.model.Presupuesto;
import io.dssd.repository.PresupuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class PresupuestoService {

    @Autowired
    private PresupuestoRepository repository;

    public Presupuesto save(Presupuesto presupuesto) {
        return repository.save(presupuesto);
    }

    public Presupuesto getById(Long id) {
        return repository.getById(id);
    }

}
