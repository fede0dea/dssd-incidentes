package io.dssd.repository;

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
public class UserRepository {

    @PersistenceContext
    protected EntityManager entityManager;

    public Usuario save(Usuario usuario) {
        entityManager.persist(usuario);
        return usuario;
    }

    public Usuario getById(Long userId) {
        return (Usuario) entityManager
            .createQuery("from Usuario where id = :id")
            .setParameter("id", userId)
            .getSingleResult();
    }

}
