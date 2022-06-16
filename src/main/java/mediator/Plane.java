package mediator;

public class Plane {

  private boolean isInTheAir;
  private int id;
/*  private Runway runway;
  private PlanesInFlight planesInFlight;
  private PlanesOnGround planesOnGround;*/


  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
 /*   runway = new Runway();
    planesInFlight = new PlanesInFlight();
    planesOnGround = new PlanesOnGround();
    planesOnGround.addPlane(this);*/
  }



  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}
