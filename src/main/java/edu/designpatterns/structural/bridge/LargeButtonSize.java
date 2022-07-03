package edu.designpatterns.structural.bridge;

public class LargeButtonSize implements ButtonSize {

    @Override
    public void setSize() {
        System.out.println("Setting size to large...");
    }
}
