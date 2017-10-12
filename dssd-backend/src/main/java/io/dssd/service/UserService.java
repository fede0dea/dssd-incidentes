package io.dssd.service;

import io.dssd.model.User;
import io.dssd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by federico on 12/10/17.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.getUserById(userId);
    }

}
