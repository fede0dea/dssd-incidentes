package io.dssd.repository;

import io.dssd.model.User;
import org.hibernate.criterion.Restrictions;

public class UserRepository extends AbstractRepository<User> {

    @Override
    public User getById(Long id) {
        return (User) sessionFactory.getCurrentSession()
            .createCriteria(User.class)
            .add(Restrictions.idEq(id))
            .uniqueResult();
    }
}
