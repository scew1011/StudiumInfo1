package uebung5;

public class Datum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(istSchaltjahr(1899));
		System.out.println(istSchaltjahr(1900));
		System.out.println(istSchaltjahr(2000));
		System.out.println(istSchaltjahr(2004));
		System.out.println(getWochentag(28,12,2016));
		
	}

	public static boolean istSchaltjahr (int jahr) {
		return ((jahr%4)==0) && (!((jahr%100)==0) || ((jahr%400)==0));
	}
	
	public static int getWochentag (int tag, int monat, int jahr) {
		//alle Jahre nach 1900 dazuaddiert, lässt also nur datum nach 1900 zu
		tag += (jahr - 1900) * 365;
		//Schaltjahre Berücksichtigung
		if (istSchaltjahr(jahr) && (monat == 1 || monat == 2)) {
			tag += ((jahr - 1900) /4) - 1;
		} else {
			tag += ((jahr - 1900) /4);
		}
		//tage innerhalb eines monates die vergangen sind
		switch(monat) {
		case 12: tag += 30;
		case 11: tag += 31;
		case 10: tag += 30;
		case 9: tag += 31;
		case 8: tag += 31;
		case 7: tag += 30;
		case 6: tag += 31;
		case 5: tag += 30;
		case 4: tag += 31;
		case 3: tag += 28;
		case 2: tag += 31;
		default: break;
		}
		int wochentag = tag % 7;
		return wochentag;
	}
}
