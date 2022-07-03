package edu.designpatterns.structural.bridge;

public class DropdownButton extends Button {

  public ButtonSize buttonType;

  public DropdownButton(ButtonSize buttonType) {
    this.buttonType = buttonType;
  }

  public void draw() {
    buttonType.setSize();
    System.out.println("Drawing a dropdown button.\n");
  }

}
