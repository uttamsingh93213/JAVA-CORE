package Constructor;

public class Triangle  extends Shape{
	private int hight;
	private int base;
	private double area;
	
	public Triangle() {}
	
	public Triangle(int hight,int base) {
		this.hight=hight;
		this.base=base;
		
	}
	public int gethight() {
		return hight;	
	}
	public int getBase() {
		return base;
	}
	public double area() {
		area=0.5*(base*hight);	
		return area;	
	}
}
