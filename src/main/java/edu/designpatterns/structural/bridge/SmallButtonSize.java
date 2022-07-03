package edu.designpatterns.structural.bridge;

public class SmallButtonSize implements ButtonSize {

    @Override
    public void setSize() {
        System.out.println("Setting size to small...");
    }
}
