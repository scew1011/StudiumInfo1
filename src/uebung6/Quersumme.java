package uebung6;

public class Quersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(quersumme(12342354));
	}

	public static int quersumme (long zahl) {
		int zwischenSumme = 0;
		long zwischenZahl;
		for (int i = 18; i>=0; i--) {
			zwischenZahl =  (zahl / (long)(Math.pow(10, i)));
			zahl = (long) (zahl - (zwischenZahl * (long)(Math.pow(10, i))));
			zwischenSumme += (int)zwischenZahl;
		}
		return zwischenSumme;
	}
}
