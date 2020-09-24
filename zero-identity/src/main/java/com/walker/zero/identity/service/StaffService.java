package com.walker.zero.identity.service;

import com.walker.zero.identity.domain.entity.Staff;
import com.walker.zero.identity.repository.StaffRepository;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author walker
 */
@Service
public class StaffService {
    private final StaffRepository repository;

    @Autowired
    public StaffService(StaffRepository repository) {
        this.repository = repository;
    }

    public Staff register(final String name, final String password) {
        if (this.repository.findByName(name).isPresent()) {
            throw new IllegalArgumentException("User [" + name + "] is already registered");
        }

        Staff staff = new Staff(name, password);
        this.repository.save(staff);
        return staff;
    }

    public ImmutableList<Staff> list() {
        return ImmutableList.copyOf(this.repository.findAll());
    }
}
