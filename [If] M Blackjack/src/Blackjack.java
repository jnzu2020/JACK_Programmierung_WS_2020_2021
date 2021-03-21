public class Blackjack {
	
	/*
	 * In dieser Methode sollst du pruefen, ob einer der beiden Parameter 'val1' oder 'val2' <= 21 ist.
	 * Die Parameter duerfen den Wert 21 nicht ueberschreiten.
	 * Am Ende soll der Parameter zurueckgegeben werden, der naeher am Wert 21 liegt.
	 * Sollten beide Parameter den selben Wert betragen und <= 21 sein, wird der Wert ausgegeben. 
	 * Sollten beide Parameter einen Wert von > 21 betragen, soll 0 ausgegeben werden. 
	 */
	public static int blackjack(int val1, int val2) {
		//zu bearbeiten
		if (val1 > 21 && val2 > 21) {
			return 0;
		} else if (val1 > 21) {
			return val2;
		} else if (val2 > 21) {
			return val1;
		} else {
			int diffOfVal1 = 21 - val1;
			int diffOfVal2 = 21 - val2;
			if (diffOfVal1 <= diffOfVal2) {
				return val1;
			} else {
				return val2;
			}
		}
	}
	
	 // In der Main-Methode kannst du deine Methode testen.  
	public static void main (String[] args) {
		System.out.println(blackjack(10,5)); 	//Erwartet: 10
		System.out.println(blackjack(15,31)); 	//Erwartet: 15
		System.out.println(blackjack(3,21));	//Erwartet: 21
		System.out.println(blackjack(50,20));	//Erwartet: 20
		System.out.println(blackjack(15,15));	//Erwartet: 15
		System.out.println(blackjack(21,21));	//Erwartet: 21
		System.out.println(blackjack(30,29));	//Erwartet: 0
	}
}