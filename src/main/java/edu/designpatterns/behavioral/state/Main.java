package edu.designpatterns.behavioral.state;

public class Main {

  public static void main(String[] args) {
    Fan fan = new Fan();
    fan.turnUp();
    fan.turnUp();
    fan.turnDown();
    fan.turnDown();
    fan.turnUp();
  }

}