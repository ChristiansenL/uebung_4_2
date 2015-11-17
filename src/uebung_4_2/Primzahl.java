package uebung_4_2;

public class Primzahl {

	//Prüfen ob eine Zahl eine Primzahl ist
	public static boolean isPrimzahl(int testzahl) {
		boolean ergebnis = true;
		for (int n = 2; n <= testzahl - 1; n++) {
			if ((testzahl % n) == 0) {
				ergebnis = false;
			}
		}
		if (ergebnis) {
			System.out.println(testzahl + " ist eine Primzahl!");
		} else {
			System.out.println(testzahl + " ist keine Primzahl!");
		}
		return ergebnis;
	}

	//Anzahl an Primzahlen in einem bestimmten Zahlenbereich ermitteln
	public static int ermittleAnzahlPrimzahlen(int von, int bis) {
		int anzahl = 0;

		for (int x = von; x <= bis - 1; x++) {
			if (isPrimzahl(x)) {
				anzahl = anzahl + 1;
			}
		}
		return anzahl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl = 37;
		int n = 1000;
		int von = 2;
		int bis = 100;

		isPrimzahl(zahl);

		System.out.println(ermittleAnzahlPrimzahlen(von, bis));

	}

}
