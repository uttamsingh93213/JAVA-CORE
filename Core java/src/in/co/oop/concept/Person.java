package in.co.oop.concept;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date dateOfBirth;
	public static final int averageAge = 18;
	
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	private double getaverageAge() {
		return 0;
	}	
}
