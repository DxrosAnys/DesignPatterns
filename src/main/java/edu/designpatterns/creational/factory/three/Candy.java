
package edu.designpatterns.creational.factory.three;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Candy {
        
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
    
}
