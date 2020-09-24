package com.walker.zero.property.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author walker
 */
@Entity
@Table(name = "zero_property")
@NoArgsConstructor
public class Property {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private long id;
}
