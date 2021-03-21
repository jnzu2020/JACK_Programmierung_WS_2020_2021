// Betragsfunktion
// 
// Implementieren Sie die Betragsfunktion in der Methode "abs". Das Ergebnis der Betragsfunktion |x| ist x, wenn x >= 0 bzw. -x, wenn x < 0. 
public class Abs {

	public static int abs(int value) {
		if (value < 0) {
			return value * -1;
		} else {
			return value;
		}
	}

	public static void main(String[] args) {
		// Testaufruf
		System.out.println("Der Betrag von -24 = " + abs(-24) + " (24 ist korrekt)");
		System.out.println("Der Betrag von   0 = " + abs(0) + " (0 ist korrekt)");
		System.out.println("Der Betrag von   4 = " + abs(4) + " (4 ist korrekt)");
	}

}
