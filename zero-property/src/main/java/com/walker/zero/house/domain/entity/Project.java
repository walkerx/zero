package com.walker.zero.house.domain.entity;

import com.walker.zero.house.domain.HouseNode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 公寓的项目或者小区
 * @author walker
 */
@Entity
@Table(name = "zero_project")
@NoArgsConstructor
public class Project extends HouseNode {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  private long id;

  private String name;
}
