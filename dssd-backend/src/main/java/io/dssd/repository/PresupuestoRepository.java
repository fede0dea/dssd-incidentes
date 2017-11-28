package io.dssd.repository;

import io.dssd.model.Objeto;
import io.dssd.model.Presupuesto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by federico on 12/10/17.
 */
@Repository
@Transactional
public class PresupuestoRepository {
     
	@PersistenceContext
    protected EntityManager entityManager;

    public Presupuesto getById(Long presupuestoId) {
        return (Presupuesto) entityManager
            .createQuery("from Presupuesto where id = :id")
            .setParameter("id", presupuestoId)
            .getSingleResult();
    }

   public Presupuesto save(Presupuesto entity) {
        entityManager.persist(entity);
        return entity;
    }
    
}
