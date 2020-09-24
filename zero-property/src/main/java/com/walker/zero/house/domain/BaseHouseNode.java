//package com.walker.zero.house.domain;
//
//import lombok.Builder;
//import lombok.Singular;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author walker
// */
//@Builder
//public class BaseHouseNode {
//  @Singular
//  public List<BaseHouseNode> children;
//  public BaseHouseNode parent;
//
//  public BaseHouseNode() {
//    this.children = new ArrayList<>();
//  }
//
//  public void addChild(BaseHouseNode node) {
//    this.children.add(node);
//    node.setParent(this);
//  }
//
//  public List<BaseHouseNode> getChildren() {
//    return this.children;
//  }
//
//  public BaseHouseNode getParent() {
//    return parent;
//  }
//
//  public void setParent(BaseHouseNode parent) {
//    this.parent = parent;
//  }
//}
