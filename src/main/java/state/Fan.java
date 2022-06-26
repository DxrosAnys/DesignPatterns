package state;

public class Fan {

 // private State turnState = new TurnDownState();
  private State state = new LowState();

//
//  public void setTurnState(State turnState) {
//    this.turnState = turnState;
//  }
//
//  public State getTurnState(){
//    return turnState;
//  }

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void turnUp() {
    getState().turnUp(this);
  }

  public void turnDown() {
    getState().turnDown(this);
  }

}
