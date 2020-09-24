package com.walker.zero.merchant.repository;

import com.walker.zero.merchant.domain.entity.Merchant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface MerchantRepository extends CrudRepository<Merchant, Long> {
    Optional<Merchant> findByMark(String mark);
}
