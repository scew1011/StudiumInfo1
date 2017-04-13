
public class WochentagBestimmen {

		public static void wochentagBestimmen(int tag, int monat, int jahr) {
			//alle vergangenen Tage seit 1.1.1900 berechenen
			//vergangene Tag mit modulo 7 berechnen
			//diesen wert per case zurückgeben
			int vergangeneTage = 0;
			String Tag = "";
			//jahr
			vergangeneTage = (jahr-1900) * 365;
			//monat
			switch (monat) {
			case 1: vergangeneTage += 31;
			case 2: if (jahr%4 == 0) {
				vergangeneTage += 29;
			} else {
				vergangeneTage += 28;
			}
			case 3: vergangeneTage += 31;
			case 4: vergangeneTage += 30;
			case 5: vergangeneTage += 31;
			case 6: vergangeneTage += 30;
			case 7: vergangeneTage += 31;
			case 8: vergangeneTage += 31;
			case 9: vergangeneTage += 30;
			case 10: vergangeneTage += 31;
			case 11: vergangeneTage += 30;
			case 12: vergangeneTage += 31;
			}
			//tag
			vergangeneTage += tag;
			//wochentag
			vergangeneTage = vergangeneTage % 7;
			switch (vergangeneTage) {
			case 0: Tag = "Montag";
			case 1: Tag = "Dienstag";
			case 2: Tag = "Mittwoch";
			case 3: Tag = "Donnerstag";
			case 4: Tag = "Freitag";
			case 5: Tag = "Samstag";
			case 6: Tag = "Sonntag";
			}	
			System.out.println(Tag);
		}
}
