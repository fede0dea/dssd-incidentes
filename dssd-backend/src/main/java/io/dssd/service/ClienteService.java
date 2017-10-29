package io.dssd.service;

import io.dssd.model.Cliente;
import io.dssd.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente getById(Long id) {
        return repository.getById(id);
    }

}
