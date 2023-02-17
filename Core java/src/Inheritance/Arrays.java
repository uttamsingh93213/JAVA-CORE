package Inheritance;

public class Arrays {
	public static void main(String[]args) {

	double sum = 0.0;
	Shape s1[]=new Shape[3];
	
	s1[0]=new Rectangle();
	Rectangle r=(Rectangle)s1[0];
	r.setLength(20);
	r.setWidth(30);
	r.area();
	System.out.println("Rectangle "+r.area());
	
	
	s1[1]=new Circle();
	Circle c=(Circle)s1[1];
	c.setradius(45);

	System.out.println("Cirle "+c.getArea());
	
	s1[2]=new Triangle();
	Triangle t=(Triangle)s1[2];
	t.setBase(30);
	t.setHight(20);
	t.getArea();
	System.out.println("Triangle "+t.getArea());
	
	
}
}
