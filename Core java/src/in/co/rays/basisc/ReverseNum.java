package in.co.rays.basisc;

public class ReverseNum {
	public static void main(String[]args) {
		int num=123321,reverse=0,reminder,count=0;
		int rem=num;
		while(num>0)
		{
			reminder=num%10;
			num=num/10;
			reverse=reverse*10+reminder;
			count++;
		}
		System.out.println("digits in number num="+count);
		System.out.println(reverse);
		//System.out.println(num);
		if(rem==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a plaindrome");
		}
		
	}
	

}
