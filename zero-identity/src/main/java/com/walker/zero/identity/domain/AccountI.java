package com.walker.zero.identity.domain;

/**
 * @author walker
 */
public interface AccountI {
  /**
   * 注册
   * @param phone 手机号
   * @param pwd 密码
   * @return 是否成功
   */
  public Boolean register(String phone, String pwd);

  /**
   * 登录
   * @param phone 手机号
   * @param pwd 密码
   * @return 是否成功
   */
  public Boolean login(String phone, String pwd);

  /**
   * 登出
   * @return 是否成功
   */
  public Boolean logout();

  /**
   * 修改密码
   * @return 是否成功
   */
  public Boolean changePwd();

  /**
   * 忘记密码
   * @return 是否成功
   */
  public Boolean forgetPwd();
}
