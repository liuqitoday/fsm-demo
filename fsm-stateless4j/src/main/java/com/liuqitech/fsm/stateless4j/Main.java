package com.liuqitech.fsm.stateless4j;

    import com.github.oxo42.stateless4j.StateMachine;
    import com.github.oxo42.stateless4j.StateMachineConfig;

public class Main {

  public static void main(String[] args) {
    StateMachineConfig<State, Event> stateMachineConfig = new StateMachineConfig<>();

    stateMachineConfig.configure(State.CONFIRMED)
        .permit(Event.USER_PAY, State.PAID);

    stateMachineConfig.configure(State.PAID)
        .permit(Event.STORE_SHIP, State.SHIPPED);

    stateMachineConfig.configure(State.SHIPPED)
        .permit(Event.USER_RECEIVE, State.RECEIVED);

    StateMachine<State, Event> stateMachine = new StateMachine<>(State.CONFIRMED, stateMachineConfig);


    try {
      stateMachine.fire(Event.USER_PAY);
      State currentState = stateMachine.getState();
      System.out.println(currentState);
    } catch (IllegalStateException e) {
      System.out.println("无效的动作");
    }
  }
}
