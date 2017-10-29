package io.dssd.service;

import io.dssd.model.Objeto;
import io.dssd.repository.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class ObjetoService {

    @Autowired
    private ObjetoRepository repository;

    public Objeto save(Objeto objeto) {
        return repository.save(objeto);
    }

    public Objeto getById(Long id) {
        return repository.getById(id);
    }

}
