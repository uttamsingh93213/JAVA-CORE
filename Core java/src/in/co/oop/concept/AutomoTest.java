package in.co.oop.concept;

public class AutomoTest {
	public static void main(String[]args) {
		Automobile a = new Automobile();
		a.setColor("red");
		a.setSpeed(50);
		a.setMake("BMW");
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());	
	}

}
