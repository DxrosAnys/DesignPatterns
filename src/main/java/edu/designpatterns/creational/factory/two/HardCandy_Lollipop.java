package edu.designpatterns.creational.factory.two;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class HardCandy_Lollipop extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_Lollipop lollipop = new HardCandy_Lollipop();
            hardCandyPackage.add(lollipop);
        }

        System.out.println("One package of " + quantity + " hard candy has been made!");
        return hardCandyPackage;

    }

}
