package uebung6;

public class Euler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eulerZahlBerechnung(20, 0)); //mehr macht lokale variable fakultaet in eulerZahlBerechnung die Grenzen überschreiten
		System.out.println(eulerZahlBerechnung(1000, 1));
	}

	public static double eulerZahlBerechnung(double durchläufe, double xwert) {
		long fakultaet = 1;
		double ergebnis = 1;
		for (int i=1; i<durchläufe; i++) {
			fakultaet = fakultaet * i;
			ergebnis += (Math.pow(xwert, i)/fakultaet);
		}
		return ergebnis;
	}
}
