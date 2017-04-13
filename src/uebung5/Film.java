package uebung5;

public class Film {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filmSehensWert(12,48,180);
		filmSehensWert(5,20,120);
	}

	public static void filmSehensWert (int toten, int schwerverletzte, double laufzeitMin) {
		boolean brutal = false;
		boolean zulang = false;
		if (toten > 7 || schwerverletzte > 127) {
			brutal = true;
		}
		if (laufzeitMin > 188.4) {
			zulang = true;
		}
		if (brutal || zulang) {
			System.out.println("Film nicht ansehen.");
			if (brutal) {
				System.out.println("Zu brutal.");
			}
			if (zulang) {
				System.out.println("Zu lang.");
			}
		} else {
			System.out.println("Film ansehen.");
		}
	}
}
