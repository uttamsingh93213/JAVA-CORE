package Inheritance;

public class Triangle extends Shape {
 private int base;
 private int hight;
 
  
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
     public double area() {
    	double area=(0.5*base*hight);
    	 return area;
    	 
     }
}
