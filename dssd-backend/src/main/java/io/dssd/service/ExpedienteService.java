package io.dssd.service;

import io.dssd.model.Expediente;
import io.dssd.repository.ExpedienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class ExpedienteService {

    @Autowired
    private ExpedienteRepository repository;

    public Expediente save(Expediente expediente) {
        return repository.save(expediente);
    }

    public Expediente getById(Long id) {
        return repository.getById(id);
    }

}
