
public class PiWert {

	public static void main(String[] args) {
		double pi;
		pi = 2.0;
		
		for (double i = 1.0; i<1000; i++) {
			pi = pi * ((2.0*i)/((2.0*i)-1.0)) * ((2.0*i)/((2.0*i)+1.0));
		}

		System.out.println(pi);
	}

}
