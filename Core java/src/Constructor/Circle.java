package Constructor;

public class Circle extends Shape {
	public int radius;
	public static final float PI=3.14f;
	private double area;
	 
	public Circle() {}
	public Circle(int radius) {
		this.radius=radius;	
	}
	public int getRadius() {
		return radius;	
	}
    public double area() {
    	area=(PI)*(radius*radius);
    	return area;
    }
}
