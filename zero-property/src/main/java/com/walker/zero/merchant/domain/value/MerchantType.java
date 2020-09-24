package com.walker.zero.merchant.domain.value;

/**
 * @author walker
 */
public enum MerchantType {
  // 商户类型
  enterprise("企业"),
  individualEnterprise("个体企业"),
  individual("个人");

  public String desc;

  MerchantType(String desc) {
    this.desc = desc;
  }
}
