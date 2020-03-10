package com.liuqitech.fsm.ifelse;


public class Order {

  private State currentState = State.CONFIRMED;

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  public State getCurrentState() {
    return currentState;
  }

  public void process(Event event) {
    if (currentState == State.CONFIRMED) {
      if (event == Event.USER_PAY) {
        this.pay();
        this.setCurrentState(State.PAID);
      }
      System.out.println("当前订单状态:" + this.getCurrentState().toString());
    } else if (currentState == State.PAID) {
      if (event == Event.STORE_SHIP) {
        this.ship();
        this.setCurrentState(State.SHIPPED);
      }
      System.out.println("当前订单状态:" + this.getCurrentState().toString());
    } else if (currentState == State.SHIPPED) {
      if (event == Event.USER_RECEIVE) {
        this.receive();
        this.setCurrentState(State.RECEIVED);
      }
      System.out.println("当前订单状态:" + this.getCurrentState().toString());
    } else if (currentState == State.RECEIVED) {
      if (event == Event.USER_RECEIVE) {
        this.receive();
        this.setCurrentState(State.RECEIVED);
      }
      System.out.println("当前订单状态:" + this.getCurrentState().toString());
    } else {
      System.out.println("当前订单状态:" + this.getCurrentState().toString());
    }
  }

  private void pay() {
    System.out.println("用户付款");
  }

  private void ship() {
    System.out.println("商家发货");
  }

  private void receive() {
    System.out.println("用户签收");
  }
}
