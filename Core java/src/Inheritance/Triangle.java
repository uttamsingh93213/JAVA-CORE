package Inheritance;

public class Triangle extends Shape {
 private int base;
 private int hight;
 //private double area;
  
     public int getBase() {
	    return base;
	 }
     public void setBase(int base) {
    	 this.base=base;
     }
     public int getHight() {
     	return hight;	
     }
     public void setHight(int hight) {
    	 this.hight=hight;
     }
     public double getArea() {
    	double area=(0.5*getBase()*getHight());
    	 return area;
    	 
     }
}
