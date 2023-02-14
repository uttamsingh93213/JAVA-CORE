package in.co.rays.basisc;

public class ForeachExample {
public static void main(String[] agrs) {
	int arr[] = {12,13,14,44,88,105,1121};
	int total=0;
	for(int i:arr){
		total=total+i;
		System.out.println("Total:"+total);
	}
	
	
}
}
