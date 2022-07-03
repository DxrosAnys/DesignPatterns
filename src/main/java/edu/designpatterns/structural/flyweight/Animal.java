package edu.designpatterns.structural.flyweight;

public interface Animal {

  String getAnimalType();
  int[] getLocation();
  void setLocation(int latitude, int longitude);

}
