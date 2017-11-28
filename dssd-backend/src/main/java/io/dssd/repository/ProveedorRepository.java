package io.dssd.repository;

import io.dssd.model.Presupuesto;
import io.dssd.model.Proveedor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by federico on 12/10/17.
 */
@Repository
@Transactional
public class ProveedorRepository {
    
    @PersistenceContext
    protected EntityManager entityManager;

    public Proveedor getById(Long proveedorId) {
        return (Proveedor) entityManager
            .createQuery("from Proveedor where id = :id")
            .setParameter("id", proveedorId)
            .getSingleResult();
    }

    public Proveedor save(Proveedor entity) {
        entityManager.persist(entity);
        return entity;
    }
}
