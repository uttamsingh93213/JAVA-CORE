package Inheritance;

public class CallShape {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		//Shape s = new Shape();
		
		
		
		r.setColor("Red");
		r.setBorderWidth(40);
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		
		r.setLength(30);
		r.setWidth(20);
		System.out.println("Area of Rectangle "+r.area());
		
		t.setHight(30);
		t.setBase(40);
		System.out.println("Area of Triangle "+t.getArea());
		
		c.setradius(60);
		System.out.println("Area of Circle "+c.getArea());
	}
}
