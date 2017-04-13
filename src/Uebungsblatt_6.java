
public class Uebungsblatt_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aufgabe1(20);
		aufgabe2();
	}
	
	public static void aufgabe1(int i) {
		int j;
		double sum = 0.0;
		
		for (j=0;j<=i;j++) {
			sum += 1 / Math.pow(2, j);
		}
		System.out.println(sum);
	}
	
	public static void aufgabe2() {
		double sum=0.0,sumCheck=0.1;
		int j=0;
		
		while (!(sum==sumCheck)) {
			sumCheck = sum;
			sum += 1 / Math.pow(2,j);
			j++;
		}
		
		System.out.println(sum);
	}
}
