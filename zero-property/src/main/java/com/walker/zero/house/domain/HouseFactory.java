package com.walker.zero.house.domain;

import com.walker.zero.house.domain.aggregation.Suite;
import com.walker.zero.house.domain.entity.Unit;
import com.walker.zero.house.domain.value.HouseType;

import java.util.ArrayList;

/**
 * @author walker
 */
public class HouseFactory {
  public House getHouse(HouseType houseType){
    ArrayList<Unit> units = new ArrayList<>();
    switch (houseType){
      case DECENTRALIZED:
        return (House) Suite.builder().children(units).build();
      case CENTRALIZED:
        break;
//        ArrayList<Floor> floors = new ArrayList<>();
//        floors.add((Floor) Floor.builder().children(units).build());
//        return (House) Building.builder().children(floors).build();
      case CENTRALIZED_DECENTRALIZED:
        break;
      default:
    }
    return null;
  }
}
