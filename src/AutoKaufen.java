
public class AutoKaufen {

	public static void main(String[] args) {
		
		int preis = 5000;
		int kilometerStand = 5000;
		boolean sportwagen = false;
		
		if ((preis <= 1000) || (kilometerStand <= 10000)) {
			System.out.println("Wagen kaufen.");
			if (kilometerStand <= 10000) {
				System.out.println("Wenig gefahren");
			}
			if (preis <= 1000) {
				System.out.println("Sehr günstig");
			} 
		} else {
			System.out.println("Wagen nicht kaufen.");
			if (sportwagen) {
				System.out.println("Obwohl es ein Sportwagen ist.");
			}
		}

	}

}
