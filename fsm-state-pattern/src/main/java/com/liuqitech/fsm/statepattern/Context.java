package com.liuqitech.fsm.statepattern;

public class Context {

  private State status;

  public Context(State status) {
    this.status = status;
  }

  public State getStatus() {
    return status;
  }

  public void setStatus(State status) {
    this.status = status;
  }

  public void request(Event event) {
    status.handle(this, event);
    System.out.println("当前订单状态:" + this.status.toString());
  }
}
