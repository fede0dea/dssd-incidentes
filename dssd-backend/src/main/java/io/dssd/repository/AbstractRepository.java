package io.dssd.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRepository<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    public abstract T getById(Long id);

    public void save(T object) {
        sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

}
