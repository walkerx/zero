package com.walker.zero.identity.domain.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author walker
 */
@Entity
@Table(name = "zero_tenant")
@NoArgsConstructor
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String realName;

    @Column(nullable = false)
    private String IDNo;

    @Column(nullable = false)
    private String IDType;

    @Column(nullable = false)
    private Boolean verified;

    public Tenant(final String phone) {
        this.phone = phone;
    }

    public Tenant(final String phone, final String password) {
        this.phone = phone;
        this.password = password;
    }
}
