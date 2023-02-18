package Inheritance;

public class Circle extends Shape{
	private int radius;
	public static final float PI=3.14f;
	private float area;
	
    public int getRadius() {
    	return radius;
    }
    public void setradius(int radius) {
    	this.radius=radius;
    }
    public double area() {
    	area=(PI)*(radius*radius);
    	return area;	
    }
    
}
