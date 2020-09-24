package com.walker.zero.identity.repository;

import com.walker.zero.identity.domain.entity.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {
    Optional<Staff> findByName(String name);
}
