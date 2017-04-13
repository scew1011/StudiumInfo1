
public class Vertauschen {

	public static void main(String[] args) {
		int b=3;
		int a='c';
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(a);
		System.out.println(b);
		
		// oben ist ausnahme fall und nur für zahlen möglich die nicht integer auslasten, 
		// ansonsten nutzt man eine Tauschvariable
		
		int t;
		int x = 3, y = 5;
		
		t = x;
		x = y;
		y = t;
		
		System.out.println(x);
		System.out.println(y);
	}

}
