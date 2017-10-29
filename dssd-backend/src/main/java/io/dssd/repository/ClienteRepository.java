package io.dssd.repository;

import io.dssd.model.Cliente;
import io.dssd.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by federico on 12/10/17.
 */
@Repository
@Transactional
public class ClienteRepository extends AbstractRepository<Cliente> {

    public Cliente getById(Long clienteId) {
        return (Cliente) entityManager
            .createQuery("from Cliente where id = :id")
            .setParameter("id", clienteId)
            .getSingleResult();
    }

}
