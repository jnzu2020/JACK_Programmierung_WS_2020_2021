import java.util.Arrays;
import java.util.Comparator;

public class CheckPalindrom {
	//Aufgabe 1
	public String reverse(String toReverse) {
		char[] chars = toReverse.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = chars.length - 1 ; i >= 0 ; i--) {
			stringBuilder.append(chars[i]);
		}
		return stringBuilder.toString();
	}
	
	//Aufgabe 2
	public boolean palindrome(String palindrome) {
		char[] chars = palindrome.toLowerCase().toCharArray();
		for (int i = 0 , j = chars.length - 1; i < palindrome.length() / 2 ; i++ , j--) {
			if (chars[i] != chars[j]) {
				return false;
			}
		}
		return true;
	}
	
	// Die Main Methode zum Testen deiner Methoden
	public static void main(String[] args) {
		CheckPalindrom check = new CheckPalindrom();
		System.out.println("Die Ausgabe sollte cba lauten: "+check.reverse("abc"));
		System.out.println("Die Ausgabe sollte ffeed lauten: "+check.reverse("deeff"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Lagerregal"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Rentner"));
		System.out.println("Die Ausgabe sollte false lauten: "+check.palindrome("Hallo Welt!"));
	}
}
