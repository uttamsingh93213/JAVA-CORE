package in.co.rays.basisc;

public class PrimeNum {

	public static void main(String[] args) {
		int num=5;
		int m=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				m=m+1;
			}}
		if(m==0) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Num is not Prime");
		}
	}
}
