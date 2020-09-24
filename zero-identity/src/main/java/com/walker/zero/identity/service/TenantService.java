package com.walker.zero.identity.service;

import com.walker.zero.identity.domain.entity.Tenant;
import com.walker.zero.identity.repository.TenantRepository;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 承租人
 * @author walker
 */
@Service
public class TenantService {
    private final TenantRepository repository;

    @Autowired
    public TenantService(final TenantRepository repository) {
        this.repository = repository;
    }

    public Tenant register(final String name, final String password) {
        if (this.repository.findByName(name).isPresent()) {
            throw new IllegalArgumentException("User [" + name + "] is already registered");
        }

        Tenant tenant = new Tenant(name, password);
        this.repository.save(tenant);
        return tenant;
    }

    public ImmutableList<Tenant> list() {
        return ImmutableList.copyOf(this.repository.findAll());
    }
}
