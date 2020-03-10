package com.liuqitech.fsm.ifelse;

public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    order.process(Event.USER_PAY);
    order.process(Event.STORE_SHIP);
    order.process(Event.USER_RECEIVE);
  }
}
