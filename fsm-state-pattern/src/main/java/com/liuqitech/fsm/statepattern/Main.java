package com.liuqitech.fsm.statepattern;

import com.liuqitech.fsm.statepattern.state.ConfirmedState;

public class Main {

  public static void main(String[] args) {
    Context context = new Context(new ConfirmedState());
    context.request(Event.USER_PAY);
    context.request(Event.STORE_SHIP);
  }
}
