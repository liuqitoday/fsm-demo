package com.liuqitech.fsm.statepattern;

public interface State {

  void handle(Context context, Event event);
}
