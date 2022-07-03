package edu.designpatterns.structural.bridge;

public  class RadioButton extends Button {

  public ButtonSize buttonType;

  public RadioButton(ButtonSize buttonType) {
    this.buttonType = buttonType;
  }


  public void draw() {
    buttonType.setSize();
    System.out.println("Drawing a radio button.\n");
  }

}
