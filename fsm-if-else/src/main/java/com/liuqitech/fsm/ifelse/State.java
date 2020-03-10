package com.liuqitech.fsm.ifelse;

/**
 * 订单状态枚举
 */
public enum State {
  /**
   * 已确认
   */
  CONFIRMED,
  /**
   * 已付款
   */
  PAID,
  /**
   * 已发货
   */
  SHIPPED,
  /**
   * 已签收
   */
  RECEIVED;
}