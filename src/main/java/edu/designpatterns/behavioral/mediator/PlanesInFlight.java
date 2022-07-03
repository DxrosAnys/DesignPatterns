package edu.designpatterns.behavioral.mediator;

import java.util.ArrayList;

public class PlanesInFlight implements Planes {

  ArrayList<Plane> planes = new ArrayList<>();

  @Override
  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  @Override
  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

}
