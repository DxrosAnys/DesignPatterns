package edu.designpatterns.creational.factory.one;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class CandyFactory {

    public static Candy getCandy(String type) {
        switch (type) {
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }

    public static ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
