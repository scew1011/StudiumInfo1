package uebung3;

public class MittlererWertDreiZahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mittlerWert(3,3,1));
	}

	public static int mittlerWert (int a, int b, int c) {
		int mitWert;
		mitWert = (a>=b) ? ((a>=c) ? ((b>=c) ? b : c) : a) : ((a>=c) ? a : ((b>=c) ? c : b)) ;
		return mitWert;
	}
}
