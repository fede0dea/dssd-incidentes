package io.dssd.repository;

import io.dssd.model.Incidente;
import io.dssd.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by federico on 12/10/17.
 */
@Repository
@Transactional
public class IncidenteRepository {
    
	@PersistenceContext
    protected EntityManager entityManager;

    public Incidente getById(Long incidenteId) {
        return (Incidente) entityManager
            .createQuery("from Incidente where id = :id")
            .setParameter("id", incidenteId)
            .getSingleResult();
    }
    
    public Incidente save(Expediente entity) {
        entityManager.persist(entity);
        return entity;
    }

}
