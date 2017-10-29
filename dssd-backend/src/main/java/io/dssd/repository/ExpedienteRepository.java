package io.dssd.repository;

import io.dssd.model.Expediente;
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
public class ExpedienteRepository extends AbstractRepository<Expediente> {

    public Expediente getById(Long expedienteId) {
        return (Expediente) entityManager
            .createQuery("from Expediente where id = :id")
            .setParameter("id", expedienteId)
            .getSingleResult();
    }

}
