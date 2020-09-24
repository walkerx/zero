package com.walker.zero.merchant.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 商户
 * @author walker
 */
@Entity
@Table(name = "zero_merchant")
@NoArgsConstructor
public class Merchant {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private long id;

  /**
   * 标记符号
   */
  @Column(nullable = false)
  private String mark;

  @Column(nullable = false)
  private String brand;


}
