package Inheritance;

public class Rectangle extends Shape {
    private int length;
    private int width;
   // private int area;
	
    public int getLength() {
    	return length;
    }
    public void setLength(int length) {
    	this.length=length;
    }
    public int getWidth() {
    	return width;	
    }
    public void setWidth(int width) {
    	this.width=width;
    }
    public int area() {
     int area = getLength()*getWidth();
        return area;
        
      }
}
