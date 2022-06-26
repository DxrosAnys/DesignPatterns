package edu.designpatterns.behavioral.template;

public class Troll extends java.lang.Character {

  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  public void defenseAction() {
    System.out.println("Defend with club");
  }

  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

}
