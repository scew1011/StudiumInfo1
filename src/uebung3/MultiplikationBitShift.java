package uebung3;

public class MultiplikationBitShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 20;
		
		System.out.println(Multiplikation33(input));
		System.out.println(Multiplikation41(input));
	}

	public static int Multiplikation33 (int input) {
		int output = input << 5;
		output += input;
		return output;
	}
	
	public static int Multiplikation41 (int input) {
		int output = input << 5;
		output += (9 * input);
		return output;
	}
}
