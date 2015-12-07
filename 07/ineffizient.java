public class EulerNumber {
	public static void main(String[] args) {
		System.out.println(summe(Integer.parseInt(args[0])));
	}

	public static double summe(int n) {
		double summe = 0.0;
		double zahl;
		for (int i = 0; i <= n; i++) {
			int fak = 1; // die Berechnung von 1 bis n
			for (int j = 1; j <= i; j++) {
				fak = fak * j; // Akkumulation von Fakultaet
			}
			zahl = 1.0 / fak;
			summe = summe + zahl;
		}
		return summe;
	}
}
