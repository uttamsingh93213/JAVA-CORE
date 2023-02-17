import in.co.oop.concept.Person;

public class Persontest {
	public static void main(String[]args) {
		Person p = new Person();
		p.setName("Uttam");
		p.setAddress("Indore");
		p.setDateOfBirth("08/12/2000");
		System.out.println(p.getname());
		System.out.println(p.getAddress());
		System.out.println(p.getDateOfBirth());	
		System.out.println(p.averageAge);	

 }
} 
 