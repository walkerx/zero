package com.walker.zero.house.domain.value;

/**
 * @author walker
 */
public enum HouseType {
  // 房源类型
  DECENTRALIZED(1, "分散式"),
  CENTRALIZED(2, "集中式"),
  CENTRALIZED_DECENTRALIZED(3, "集散式");

  public Integer type;
  public String name;

  HouseType(Integer type, String name) {
    this.type = type;
    this.name = name;
  }
}
