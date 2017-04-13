
public class uebung5_3 {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 1;
		
		if (a>=b) {
			a = b+a;
			b = a-b;
			a = a-b;
		}
		if (a>=c) {
			a = c+a;
			c = a-c;
			a = a-c;
		}
		if (b>=c) {
			b = b+c;
			c = b-c;
			b = b-c;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c
				);
	}

}
