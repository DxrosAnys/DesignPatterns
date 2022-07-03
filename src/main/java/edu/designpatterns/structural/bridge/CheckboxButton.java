package edu.designpatterns.structural.bridge;

public class CheckboxButton extends Button {

  public ButtonSize buttonType;

  public CheckboxButton(ButtonSize buttonType) {
    this.buttonType = buttonType;
  }

  public void draw() {
    buttonType.setSize();
    System.out.println("Drawing a checkbox button.\n");
  }

}
