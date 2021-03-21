
public class Answer {
	/*
	 * Die main Methode verschiedene Aufrufe testen
	 */
	public static void main(String[] args) {
		System.out.println(Answer.theAnswer(42));//sollte true zurueckgeben
		System.out.println(Answer.theAnswer(27));//sollte false zurueckgeben
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der übergeben Parameter 42 ist.
	 * Falls also gilt zahl = 42, soll true zurückgegeben werden, ansonsten false.
	 */
	public static boolean theAnswer(int zahl)
	{
		//Hier beginnt der zu bearbeitende Bereich
		//Hier soll anstatt von return false ueberprueft werden: Falls zahl==42 gilt, wird true zurueckgegeben, sonst false
		if (zahl == 42) {
			return true;
		} else {
			return false;
		}
		//Hier endet der zu bearbeitende Bereich
	}
}
