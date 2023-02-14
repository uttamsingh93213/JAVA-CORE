
public class PrimeNum {

	public static void main(String[] args) {
		
		int num=3,i;
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.println("not a prime number");
					break;
				}
			}
			if(i==num)
			{
				System.out.println("prime nuimber");
			}
	}
}