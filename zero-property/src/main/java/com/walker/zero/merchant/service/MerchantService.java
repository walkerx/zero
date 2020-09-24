package com.walker.zero.merchant.service;

import com.walker.zero.merchant.domain.entity.Merchant;
import com.walker.zero.merchant.repository.MerchantRepository;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author walker
 */
@Service
public class MerchantService {
    private final MerchantRepository repository;

    @Autowired
    public MerchantService(final MerchantRepository repository) {
        this.repository = repository;
    }

    public Merchant create(final String brand) {
        Merchant merchant = new Merchant();
        this.repository.save(merchant);
        return merchant;
    }

    public ImmutableList<Merchant> list() {
        return ImmutableList.copyOf(this.repository.findAll());
    }
}
