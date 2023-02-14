package in.co.oop.concept;

public class shapecall {
	public static void main(String[]args) {
		Shape s;
		s=new Shape();
		s.setColor("Pink");
		s.setBorderWidth(2);
		int borderW=s.getBorderWidth();
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

		
	}

}
