public class Modulo {
	
	/*
	 * Diese Methode soll zurueckgeben, ob die Zahl zahl1 ganzzahlig durch zahl2 teilbar ist.
	 * Eine Zahl ist genau dann ganzzahlig durch eine andere Zahl teilbar, wenn zahl1%zahl2==0 ist.
	 * Also muss diese Methode ueberpruefen, ob zahl1%zahl2 == 0. Falls dieser Ausdruck wahr ist, soll
	 * true zurueckgegeben werden, falls nicht, soll false zurueckgegeben werden.
	 */
	public static boolean teilbar(int zahl1, int zahl2)
	{
		if (zahl1 % zahl2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//In dieser Methode kannst du deine Methode testen
	public static void main(String[] args) {
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 3 sollte false liefern. Deine Methode liefert: " + teilbar(20, 3));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 2 sollte true liefern. Deine Methode liefert: " + teilbar(20, 2));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 20 und 5 sollte true liefern. Deine Methode liefert: " + teilbar(20, 5));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 42 und 7 sollte true liefern. Deine Methode liefert: " + teilbar(42, 7));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 42 und 4 sollte false liefern. Deine Methode liefert: " + teilbar(42, 4));
		System.out.println("Der Aufruf deiner Methode mit den Parametern 11 und 3 sollte false liefern. Deine Methode liefert: " + teilbar(11, 3));
	}
}
