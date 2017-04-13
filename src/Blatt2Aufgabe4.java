import java.util.*;
public class Blatt2Aufgabe4 {

	public static void main(String[] args) {
		System.out.print("Bitte geben sie eine Zahl ein:");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		
		double f = (x + 1) * (x - 2) * (x - 3);
		System.out.println(f);
	}

}
