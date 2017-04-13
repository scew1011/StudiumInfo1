package uebung3;

public class BitShiftFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doubling(6f));
	}

	public static float doubling(float input) {
		int tempEntire = Float.floatToIntBits(input);
		int tempExponent = tempEntire << 1;
		tempExponent = tempExponent >>> 24;
		int tempPosNeg = tempEntire >>> 31;
		int tempMantisse = tempEntire << 9;
		tempMantisse = tempMantisse >>> 9;
		tempExponent += 1;
		tempEntire = (tempPosNeg << 31) + (tempExponent << 23) + (tempMantisse);
		return Float.intBitsToFloat(tempEntire);
	}
}
