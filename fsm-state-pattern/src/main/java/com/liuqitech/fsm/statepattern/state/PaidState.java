package com.liuqitech.fsm.statepattern.state;

import com.liuqitech.fsm.statepattern.Context;
import com.liuqitech.fsm.statepattern.Event;
import com.liuqitech.fsm.statepattern.State;

public class PaidState implements State {

  @Override
  public void handle(Context context, Event event) {
    if (event == Event.STORE_SHIP) {
      this.ship();
      context.setStatus(new ShippedState());
    }
  }

  private void ship() {
    System.out.println("商家发货");
  }

  @Override
  public String toString() {
    return "PaidState";
  }
}
