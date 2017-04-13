package uebung3;

public class Umrechnung {

	public static void main(String[] args) {
		int i = 0b1000_0000_0000_0000_0000_0000_0000_0000;
		float f = Float.intBitsToFloat(i);
		
		System.out.println(f);
		
		i = 0x3f400000;
		f = Float.intBitsToFloat(i);
		
		System.out.println(f);
		
		f = 0.1f;
		i = Float.floatToIntBits(f);
		System.out.println(Integer.toBinaryString(i));
	}

}
