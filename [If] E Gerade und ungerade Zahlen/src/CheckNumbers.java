public class CheckNumbers {
	

	// Aufgabe 1
	public static boolean checkEven(int number)
	{
		//Dieses Return Statement ist zu bearbeiten.
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Aufgabe 2
	public static boolean checkOdd(int number)
	{
		//Dieses Return Statement ist zu bearbeiten.
		if (number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//In der Main Methode werden verschiedene Testfaelle getestet. Sie koennen sich aber auch eigene ausdenken und testen
	public static void main(String[] args) {
		System.out.println(checkEven(42));//Sollte true zurueckgeben
		System.out.println(checkEven(27));//Sollte false zurueckgeben
		System.out.println(checkEven(28));//Sollte true zurueckgeben
		System.out.println(checkOdd(42));//Sollte false zurueckgeben
		System.out.println(checkOdd(27));//Sollte true zurueckgeben
		System.out.println(checkOdd(28));//Sollte false zurueckgeben
	}
}
