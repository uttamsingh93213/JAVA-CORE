package Constructor;



public class TestShape {
	public static void main(String[]args) {
    // Shape S1 = new Shape();
     //Shape S2 = new Shape("Red",10);
     //System.out.println(S2.getColor());
     //System.out.println(S2.getBorderWidth());
	
	double sum = 0.0;
	Shape s1[] = new Shape[3];
	s1[0]=new Ractangle(10,89);
	s1[1]=new Circle(20);
	s1[2]=new Triangle(20,40);
	for(int i=0;i<s1.length;i++)
	{
		sum=sum+s1[i].area();
	}System.out.println("Sum of all area:"+sum);
}
}