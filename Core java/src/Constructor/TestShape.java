package Constructor;

public class TestShape {
	public static void main(String[]args) {
     Shape S1 = new Shape();
     Shape S2 = new Shape("Red",10);
     System.out.println(S2.getColor());
     System.out.println(S2.getBorderWidth());
  
     

}}
