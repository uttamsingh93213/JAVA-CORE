package Constructor;

public class Ractangle extends Shape {
 private int length;
 private int width;
 private double area;
 
 public Ractangle(){
	 
 }
 public Ractangle(int length,int width) {
	 this.length=length;
	 this.width=width; 
	 
 }
 public int getLength() {
	 return length;
 }
 public int getWidth() {
	 return width;
 }
 public double area() {
	double area=(length*width);
		return area;
	}
}
