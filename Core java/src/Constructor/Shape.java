package Constructor;

public class Shape {
	private String color;
	private int borderWidth;
	
	public Shape() {
		System.out.println("default");
	}
	public Shape(String color,int borderWidth) {
		this.color=color;
		this.borderWidth=borderWidth;
			}
	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	
}
