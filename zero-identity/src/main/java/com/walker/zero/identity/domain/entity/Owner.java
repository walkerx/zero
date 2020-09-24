package com.walker.zero.identity.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author walker
 */
@Entity
@Table(name = "zero_owner")
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Column(nullable = false)
    @Getter
    private String name;

    @Column(nullable = false)
    @Getter
    private String password;

    public Owner(final String name, final String password) {
        this.name = name;
        this.password = password;
    }
}
