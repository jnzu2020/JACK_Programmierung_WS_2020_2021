public class Pyramide {
	
	/*
	 * Diese Methode soll eine Pyramide aus * zurueckgeben.
	 * Dabei wird mit n die breite der untersten Reihe angegeben.
	 * Als n wird immer eine ungerade Zahl angegeben.
	 * Eine Pyramide sieht wie folgt aus:
	 *   *
	 *  ***
	 * *****
	 * Diese wird so erstellt, dass in der obersten Zeile 1 * ist, in der darunterliegenden 3 *,...
	 * in der (n/2+1)ten Zeile (die unterste Zeile) kommmen n *.
	 * Vor dem ersten * in jeder Zeile muessen noch Leerzeichen eingesetzt werden,
	 * damit die Sterne jeder Zeile in der Mitte stehen. Nach dem letzten Stern in
	 * jeder Zeile kommt ein Zeilenumbruch, dann beginnt die n�chste Zeile.
	 * Nach der letzten Zeile folgt KEIN Zeilenumbruch mehr.
	 * Das Zeichen Zeilenumbruch ist das Folgende: \n
	 */
	public static String machePyramide(int n) {
		int height = n / 2 + 1;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0 ; i < height ; i++) {
			for (int j = 0 ; j < height - i - 1 ; j++) {
				stringBuilder.append(" ");
			}
			for (int k = 0 ; k < 2 * i + 1 ; k++) {
				stringBuilder.append("*");
			}
			stringBuilder.append("\n");
		}
		stringBuilder.setLength(stringBuilder.length() - 1);
		return stringBuilder.toString();
	}
	
	/*
	 * Beispielmethode.
	 * So sieht die Loesung fuer n=5 aus.
	 */
	public static String beispiel() {
		return "  *\n ***\n*****";
	}
	
	//In der Main Methode kannst du deine eigene Methode testen. Du kannst natuerlich auch eigene Testfaelle schreiben.
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(machePyramide(1));
		System.out.println();
		System.out.println(machePyramide(3));
		System.out.println();
		System.out.println(machePyramide(5));
		System.out.println();
		System.out.println(machePyramide(7));
	}
}