package com.walker.zero.house.domain.aggregation;

import com.walker.zero.common.domain.entity.City;
import com.walker.zero.house.domain.entity.Project;
import com.walker.zero.common.domain.entity.District;
import com.walker.zero.common.domain.entity.Province;

/**
 * @author walker
 */
public class Address {
  private Province province;
  private City city;
  private District district;
  private Project community;
  private double longitude;
  private double latitude;
  private String description;

  /**
   * building 几栋
   */
  private String building;
  /**
   * 楼层
   */
  private String floor;
  /**
   * 门牌
   */
  private String number;
  private String unit;
}
