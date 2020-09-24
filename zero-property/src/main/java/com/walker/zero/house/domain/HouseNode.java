package com.walker.zero.house.domain;

import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 */
@SuperBuilder
public abstract class HouseNode {
  @Singular
  public List<HouseNode> children;
  public HouseNode parent;

  public HouseNode() {
    this.children = new ArrayList<>();
  }

  public void addChild(HouseNode node) {
    this.children.add(node);
    node.setParent(this);
  }

  public List<HouseNode> getChildren() {
    return this.children;
  }

  public HouseNode getParent() {
    return parent;
  }

  public void setParent(HouseNode parent) {
    this.parent = parent;
  }
}
