package uebung4;

public class Geschwindigkeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kmhZuMph(180) + " mph");
		System.out.println(msZuKmh(50) + " kmh");
		System.out.println(msZuMph(50) + " mph");
	}

	public static double kmhZuMph (double kmh) {
		double mph = 1.609344 * kmh;
		return mph;
	}
	
	public static double msZuKmh (double ms) {
		double kmh = ms / (1.0 / 3.6);
		return kmh;
	}
	
	public static double msZuMph (double ms) {
		double kmh = msZuKmh(ms);
		double mph = kmhZuMph(kmh);
		return mph;
	}
}
