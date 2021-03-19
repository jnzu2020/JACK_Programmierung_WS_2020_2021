public class Flaeche {

	/*
	 * Diese Methode soll die Flaeche berechnen, die das gegebene Rechteck belegt.
	 * Dabei ist breite die Breite des Rechtecks, hoehe die Hoehe.
	 * Die Flaeche eines Rechtecks kann man wie folgt berechnen:
	 * Sei a die Laenge einer Seite des Rechtecks, b die Laenge der anderen Seite.
	 * Die Flaeche eines Rechtecks ist dann: Flaeche = a*b
	 * Beispiel: rechteck(10,5)--> 50
	 */
	public static double rechteck(double breite, double hoehe) {
		return breite * hoehe;
	}
	
	/*
	 * Diese Methode soll auch die Flaeche berechnen, die das gegebene Rechteck belegt.
	 * Dabei ist (x1,y1) die linke obere Ecke, (x2,y2) die rechte untere Ecke.
	 * Beispiel: rechteck(0,0,10,5)--> 50
	 */
	public static double rechteck(double x1, double y1, double x2, double y2) {
		return (x2 - x1) * (y2 - y1);
	}
	
	/*
	 * Diese Methode berechnet die Flaeche des gegebenen Kreises.
	 * Bei einem Kreis berechnet man die Flaeche durch:
	 * Flaeche = PI*radius*radius
	 * PI kann man durch Math.PI bekommen
	 */
	public static double kreis(double radius) {
		return Math.PI * radius * radius;
	}

	/*
	 * In der Main Methode kannst du deine Methoden testen.
	 * Du kannst auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		System.out.println("Die Ausgabe sollte 50.0 lauten: "+rechteck(10, 5));
		System.out.println("Die Ausgabe sollte 50.0 lauten: "+rechteck(0, 0, 10, 5));
		System.out.println("Die Ausgabe sollte 50.0 lauten: "+kreis(Math.sqrt(50/Math.PI)));
	}
}