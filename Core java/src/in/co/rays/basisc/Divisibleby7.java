package in.co.rays.basisc;

public class Divisibleby7 {
public static void main(String[]args) {
	int sum = 0;
	for(int i=100;i<=200;i++)
		if(i%7==0){
			sum=sum+i;
			System.out.println("Number Divisible by 7 "+i);
			
			}
	{
			
		System.out.println("Sum of all integers b/w 100 and 200 "+sum);
	
	
	}
}
}

