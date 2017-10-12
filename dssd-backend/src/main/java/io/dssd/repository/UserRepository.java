package io.dssd.repository;

import io.dssd.model.User;
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
    private EntityManager entityManager;

    public User save(User user) {
        entityManager.persist(user);
        return user;
    }

    public User getUserById(Long userId) {
        return (User) entityManager
            .createQuery("from User where id = :id")
            .setParameter("id", userId)
            .getSingleResult();
    }

}
