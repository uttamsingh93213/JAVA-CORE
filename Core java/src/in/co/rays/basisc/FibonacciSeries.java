package in.co.rays.basisc;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
