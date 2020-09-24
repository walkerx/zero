package com.walker.zero.house.domain.value;

/**
 * @author walker
 */

public enum Orientation {
  // 朝向
  EAST(1, "东"),
  SOUTH(2, "南"),
  WEST(3, "西"),
  NORTH(4, "北"),
  NORTHEAST(5, "东北"),
  SOUTHEAST(6, "东南"),
  NORTHWEST(7, "西北"),
  SOUTHWEST(8, "西南");

  public Integer type;
  public String name;

  Orientation(Integer type, String name) {
    this.type = type;
    this.name = name;
  }
}
