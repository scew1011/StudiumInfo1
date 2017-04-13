import java.util.*;
public class Blatt2Aufgabe3 {

	public static void main(String[] args) {
		System.out.print("Geben sie eine Zahl ein, die 32-mal mit sich selbst multipliziert werden soll:");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		a = a*a;
		a = a*a;
		a = a*a;
		a = a*a;
		a = a*a;
		System.out.println("Die Zahl ist 32 mal multipliziert:" + a);
	}

}
