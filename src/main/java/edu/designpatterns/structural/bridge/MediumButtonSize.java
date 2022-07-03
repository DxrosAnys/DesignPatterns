package edu.designpatterns.structural.bridge;

public class MediumButtonSize implements ButtonSize {

    @Override
    public void setSize() {
        System.out.println("Setting size to medium...");
    }
}
