//Klassenvariable Beispiel
public class Erde {
	
	public static final double AQUATOR_UMFANG = 40075.017; //in km
	private static double bahnGeschwindigkeit = 29.78; //km/h
	
	public static void bahnGeschwindigkeitErhoen (double prozent) { //5 ist daselbe wie 5%
		Erde.bahnGeschwindigkeit += (prozent/100.0) * Erde.bahnGeschwindigkeit;
	}
	
	public static void main(String[] args) {
		System.out.println(Erde.bahnGeschwindigkeit);
		Erde.bahnGeschwindigkeitErhoen(10.0);
		System.out.println(Erde.bahnGeschwindigkeit);
		
		int bahnGeschwindigkeit = 5;
		
		System.out.println(bahnGeschwindigkeit); //Klassenvariable ist nicht sichtbar
												// sie ist verdeckt und zuerst wird 
												// lokale benutzt danach die klassenvariable
	}
}
