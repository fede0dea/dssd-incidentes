package io.dssd.repository;

import io.dssd.model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by federico on 12/10/17.
 */
public abstract class AbstractRepository<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public abstract T getById(Long entityId);

}
