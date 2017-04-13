import java.util.*;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		System.out.print("Bitte geben Sie die Temperatur in Celcius an: ");
		Scanner scanner = new Scanner(System.in);
		double temperatureInCelcius = scanner.nextDouble();
		double temperatureInFahrenheit;
		
		temperatureInFahrenheit = ((9.0 / 5.0) * temperatureInCelcius) + 32;
		
		System.out.print("Die Temperature beträgt " + temperatureInFahrenheit + "°F.");
	}

}
