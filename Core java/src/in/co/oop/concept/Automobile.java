package in.co.oop.concept;

public class Automobile {
  private String color;
  private int speed;
  private String make;
  public static final int NO_OF_GEARS=5;
  
  public String getColor() {
	  return color;
  }
  public void setColor(String color) {
	  this.color=color;  
  }
  public int getSpeed() {	  
	  return speed;
  }
  public void setSpeed(int speed) {
	  this.speed=speed;
  }
  public String getMake() {
	  return make;  
  }
  public void setMake(String make) {
      this.make=make;
  }
}
