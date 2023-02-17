package in.co.oop.concept;

public class PersonTest {
	public static void main(String[]args) {
		Person p = new Person();
		p.setName("Uttam");
		p.setAddress("Indore");
		//p.setDateOfBirth(08/06/1990);
		System.out.println(p.getname());
		System.out.println(p.getAddress());
		System.out.println(p.getDateOfBirth());
		System.out.println(p.averageAge);
		
		
	}

}
