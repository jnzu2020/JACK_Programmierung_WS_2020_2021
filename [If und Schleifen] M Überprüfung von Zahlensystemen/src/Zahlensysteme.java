public class Zahlensysteme {

	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Dualzahl interpretierbar ist.
	 * Eine Dualzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 und 1 besteht.
	 * Enthaelt der String also nur 0 und 1, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istDualZahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (c != '0' && c != '1') {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Dezimalzahl interpretierbar ist.
	 * Eine Dezimalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 9 besteht.
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istDezimalzahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Hexadezimalzahl interpretierbar ist.
	 * Eine Hexadezimalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 9 und A bis F besteht.
	 * Diese Zahl kann also 16 verschiedene Ziffern haben: 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istHexadezimalzahl(String zahl)
	{
		String str = "0123456789ABCDEF";
		for (char c : zahl.toCharArray()) {
			if (!str.contains(c + "")) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Oktalzahl interpretierbar ist.
	 * Eine Oktalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 7 besteht.
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istOktalzahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (c < '0' || c > '7') {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * In der Main Methode kannst du deine eigenen Methoden testen.
	 * Du darfst auch eigeneTestfaelle schreiben.
	 */
	public static void main(String[] args) {
		System.out.println(istDualZahl("101010"));//Sollte true sein
		System.out.println(istDualZahl("123"));//Sollte false sein
		System.out.println(istDezimalzahl("42"));//Sollte true sein
		System.out.println(istDezimalzahl("12AB"));//Sollte false sein
		System.out.println(istHexadezimalzahl("123ABC"));//Sollte true sein
		System.out.println(istHexadezimalzahl("EFG"));//Sollte false sein
		System.out.println(istOktalzahl("1234567"));//Sollte true sein
		System.out.println(istOktalzahl("876543210"));//Sollte false sein
	}
}
