
package edu.designpatterns.creational.factory.one;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
