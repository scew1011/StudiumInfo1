
public class Wohnflaeche {

	public static void main(String[] args) {
		double jahrespraemie;
		int wohnflaeche = 90;
		int personen = 3;
		
		switch (personen) {
		case 1: 
		case 2: jahrespraemie = 10 + (wohnflaeche / 2);
				break;
		case 3: jahrespraemie = 15 + wohnflaeche;
				break;
		case 4: jahrespraemie = (15 + (wohnflaeche * 1.5));
				break;
		default: jahrespraemie = (25 + (wohnflaeche * 2));
		}
		

	}

}
