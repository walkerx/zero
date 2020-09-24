package com.walker.zero.property.service;

import com.walker.zero.property.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author walker
 */
@Service
public class PropertyService {
    private final PropertyRepository repository;

    @Autowired
    public PropertyService(final PropertyRepository repository) {
        this.repository = repository;
    }

//    public User register(final String name, final String password) {
//        if (this.repository.findByName(name).isPresent()) {
//            throw new IllegalArgumentException("User [" + name + "] is already registered");
//        }
//
//        User user = new User(name, password);
//        this.repository.save(user);
//        return user;
//    }
//
//    public ImmutableList<User> list() {
//        return ImmutableList.copyOf(this.repository.findAll());
//    }
}
