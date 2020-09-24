package com.walker.zero.merchant.controller;

import com.walker.zero.merchant.domain.entity.Merchant;
import com.walker.zero.merchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author walker
 */
@RestController
public class MerchantController {

    private MerchantService service;

    @Autowired
    public MerchantController(final MerchantService service) {
        this.service = service;
    }

    @PostMapping("/merchants")
    public ResponseEntity register(@RequestBody final String brand) {
      this.service.create(brand);
      return ResponseEntity.ok().build();
    }

    @GetMapping("/merchants")
    public List<Merchant> list() {
        return this.service.list();
    }
}
