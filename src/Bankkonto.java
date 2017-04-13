import java.util.*;

public class Bankkonto {

	public static void main(String[] args) {
		System.out.print("Bitte geben Sie ihr Guthaben ein: "); 
		Scanner scanner = new Scanner(System.in);
		double guthabenInEuro = scanner.nextDouble();
		
		System.out.println("Guthaben = " + guthabenInEuro);
		guthabenInEuro = guthabenInEuro + 100.0;
		System.out.println("Guthaben = " + guthabenInEuro);
		guthabenInEuro = guthabenInEuro - 50.0;
		System.out.println("Guthaben = " + guthabenInEuro);

		double zinsSatz = 0.5;

		System.out.println("Guthaben nach einem Jahr mit 50% Zins = " + guthabenInEuro * (1 + zinsSatz));
		
		
	}

}
