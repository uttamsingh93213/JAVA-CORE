package in.co.rays.basisc;

public class HarmonicSeries {

	public static void main(String[] args) {
		int n=5;
		double t=0.0;
		for(int i=1;i<=n;i++) {
			
		System.out.print("1/"+i+"+");
		t=t+(double)1/i;
		
	}System.out.println("\n\nsum of harmonic series" +t);
	
	}}
