
public class EuklidischerAlgorithmus {
	
	public static int ggT(int a, int b) {
		while (a != b) {
			if (a < b) {
				b = b - a;
			} else {
				a = a -b;
			}
		} 
		
		return a;
	}
	
	public static void main(String [] s) {
		System.out.println(ggT(15,9));
		System.out.println(ggT(3*3*5*5*5*17,2*5*11*17));
		
	}
}
