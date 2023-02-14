package in.co.rays.basisc;

public class SwitchCase {
	public static void main(String[] args) {
	int size = args.length;
	switch (size) {
	case 0:
		System.out.println("Usage : java HelloAll n1 n2 n3..");
		break;	
	case 1:
		System.out.println("Hello"+args[0]);
		break;
		default :
			for (int i=0;i<size;i++) {
				System.out.println(i+"=Hello"+args[i]);
				
			}
	
		
		
	}
	
	}

}
