package com.walker.zero.identity.repository;

import com.walker.zero.identity.domain.entity.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface TenantRepository extends CrudRepository<Tenant, Long> {
    Optional<Tenant> findByName(String name);
}
