package uebung5;

public class BauerFuchsHuhnGetreide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zustand(bootFahren(0,2));
		zustand(bootFahren(4,0));
		zustand(bootFahren(5,1));
		zustand(bootFahren(6,2));
		zustand(bootFahren(11,3));
		zustand(bootFahren(12,0));
		zustand(bootFahren(13,2));
	}

	public static void zustand (int aktuellerZustand) {
		int bauer = 0, fuchs = 0, huhn = 0, getreide = 0;
		
		switch(aktuellerZustand) {
		case 0: bauer = 0;
				fuchs = 0;
				huhn = 0;
				getreide = 0;
				break;
		case 1: bauer = 1;
				fuchs = 0;
				huhn = 2;
				getreide = 1;
				break;
		case 2: bauer = 1;
				fuchs = 1;
				huhn = 0;
				getreide = 2;
				break;
		case 3: bauer = 1;
				fuchs = 1;
				huhn = 2;
				getreide = 1;
				break;	
		case 4: bauer = 1;
				fuchs = 0;
				huhn = 1;
				getreide = 0;
				break;
		case 5: bauer = 0;
				fuchs = 0;
				huhn = 1;
				getreide = 0;
				break;
		case 6: bauer = 1;
				fuchs = 1;
				huhn = 1;
				getreide = 0;
				break;
		case 7: bauer = 1;
				fuchs = 0;
				huhn = 1;
				getreide = 1;
				break;
		case 8: bauer = 0;
				fuchs = 1;
				huhn = 2;
				getreide = 0;
				break;
		case 9: bauer = 0;
				fuchs = 0;
				huhn = 1;
				getreide = 2;
				break;
		case 10: bauer = 0;
				fuchs = 0;
				huhn = 0;
				getreide = 1;
				break;
		case 11: bauer = 0;
				fuchs = 1;
				huhn = 0;
				getreide = 0;
				break;
		case 12: bauer = 1;
				fuchs = 1;
				huhn = 0;
				getreide = 1;
				break;
		case 13: bauer = 0;
				fuchs = 1;
				huhn = 0;
				getreide = 1;
				break;
		case 14: bauer = 1;
				fuchs = 1;
				huhn = 1;
				getreide = 1;
				break;
		default: System.out.println("Der Bauer kann diesen Zug nicht ausführen, weil der davorige Zustand ein Ende war, oder der Bauer nicht das benutzte Ding übertragen kann. Versuchen Sie es nochmal.");
		}
		if (bauer == 0) {
			System.out.println("Der Bauer ist auf dem ersten Ufer.");
		} else {
			System.out.println("Der Bauer ist auf dem zweiten Ufer.");
		}
		if (fuchs == 0) {
			System.out.println("Der Fuchs ist auf dem ersten Ufer.");
		} else {
			System.out.println("Der Fuchs ist auf dem zweiten Ufer.");
		}
		if (huhn == 0) {
			System.out.println("Der Huhn ist auf dem ersten Ufer.");
		} else if (huhn == 1) {
			System.out.println("Der Huhn ist auf dem zweiten Ufer.");
		} else {
			System.out.println("Der Huhn wurde vom Fuchs gefressen.");
		}
		if (getreide == 0) {
			System.out.println("Der Getreide ist auf dem ersten Ufer.");
		} else if (getreide == 1) {
			System.out.println("Der Getreide ist auf dem zweiten Ufer.");
		} else {
			System.out.println("Der Getreide wurde vom Huhn gefressen.");
		}
	}
	
	public static int bootFahren(int aktuellerZustand, int ding) {
		switch(aktuellerZustand) {
		case 0: switch(ding) {
			case 1: return 2;
			case 2: return 4;
			case 3: return 1;
			default: return 3;
			}
		case 4: switch(ding) {
			case 1: return -1;
			case 2: return 0;
			case 3: return -1;
			default: return 5;
			}
		case 5: switch(ding) {
			case 1: return 6;
			case 2: return -1;
			case 3: return 7;
			default: return 4;
			}
		case 6: switch(ding) {
			case 1: return 5;
			case 2: return 11;
			case 3: return -1;
			default: return 8;
			}
		case 7: switch(ding) {
			case 1: return -1;
			case 2: return 10;
			case 3: return 5;
			default: return 9;
			}
		case 10: switch(ding) {
			case 1: return 12;
			case 2: return 7;
			case 3: return -1;
			default: return 1;
			}
		case 11: switch(ding) {
			case 1: return -1;
			case 2: return 6;
			case 3: return 12;
			default: return 2;
			}
		case 12: switch(ding) {
			case 1: return 10;
			case 2: return -1;
			case 3: return 11;
			default: return 13;
			}
		case 13: switch(ding) {
			case 1: return -1;
			case 2: return 14;
			case 3: return -1;
			default: return 12;
		}
		default: return -1;
		}
	}
}
