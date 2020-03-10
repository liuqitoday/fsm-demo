package com.liuqitech.fsm.statepattern.state;

import com.liuqitech.fsm.statepattern.Context;
import com.liuqitech.fsm.statepattern.Event;
import com.liuqitech.fsm.statepattern.State;

public class ConfirmedState implements State {

  @Override
  public void handle(Context context, Event event) {
    if (event == Event.USER_PAY) {
      this.pay();
      context.setStatus(new PaidState());
    }
  }

  private void pay() {
    System.out.println("用户付款");
  }
}
