package com.walker.zero.house.domain.entity;

import com.walker.zero.house.domain.HouseNode;
import com.walker.zero.house.domain.Rentable;
import com.walker.zero.house.domain.value.Orientation;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 可租单元
 *
 * @author walker
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Unit extends HouseNode implements Rentable {
  private String name;
  private int price;
  private int basePrice;
  private float area;
  private Orientation orientation;
}
