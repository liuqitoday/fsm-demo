package com.liuqitech.fsm.statepattern.state;

import com.liuqitech.fsm.statepattern.Context;
import com.liuqitech.fsm.statepattern.Event;
import com.liuqitech.fsm.statepattern.State;

public class ShippedState implements State {

  @Override
  public void handle(Context context, Event event) {

  }

  @Override
  public String toString() {
    return "ShippedState";
  }
}
