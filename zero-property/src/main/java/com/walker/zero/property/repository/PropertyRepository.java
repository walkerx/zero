package com.walker.zero.property.repository;

import com.walker.zero.property.domain.entity.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {
//  Optional<Property> findByName(String name);
}