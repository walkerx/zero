package com.walker.zero.lease.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author walker
 */
@Entity
@Table(name = "zero_lease")
@NoArgsConstructor
public class Lease {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private long id;

  @Column(nullable = false)
  private String tenantPhone;

  @Column(nullable = false)
  private String tenantName;

  @Column(nullable = false)
  private String tenantID;


}
