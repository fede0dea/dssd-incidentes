package io.dssd.repository;

import io.dssd.model.Incidente;
import io.dssd.model.Objeto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by federico on 12/10/17.
 */
@Repository
@Transactional
public class ObjetoRepository extends AbstractRepository<Objeto> {

    public Objeto getById(Long objetoId) {
        return (Objeto) entityManager
            .createQuery("from Objeto where id = :id")
            .setParameter("id", objetoId)
            .getSingleResult();
    }
    
   public Objeto save(Objeto entity) {
        entityManager.persist(entity);
        return entity;
    }

}
