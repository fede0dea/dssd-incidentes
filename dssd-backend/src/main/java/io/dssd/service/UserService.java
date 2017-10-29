package io.dssd.service;

import io.dssd.model.Usuario;
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

    public Usuario save(Usuario user) {
        return userRepository.save(user);
    }

    public Usuario getUserById(Long userId) {
        return userRepository.getById(userId);
    }

}
