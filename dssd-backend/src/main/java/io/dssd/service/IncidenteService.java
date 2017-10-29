package io.dssd.service;

import io.dssd.model.Incidente;
import io.dssd.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository repository;

    public Incidente save(Incidente incidente) {
        return repository.save(incidente);
    }

    public Incidente getById(Long id) {
        return repository.getById(id);
    }

}
