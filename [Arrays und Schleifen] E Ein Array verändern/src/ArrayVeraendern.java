import java.util.Arrays;

public class ArrayVeraendern {
	// Aufgabe 1
	public static void change(int[] array, int position, int number) {
		//Hier beginnt der zu bearbeitende Teil
		array[position] = number;
		//Hier endet der zu bearbeitende Teil
	}
	
	 // Die main Methode. Hier koennen Sie verschiedene Testfaelle ausprobieren:
	public static void main(String[] args) {
		int[] test = new int[]{1,2,3,4,5};//Das Array, welches getestet wird
		change(test, 2, 42);//Methode wird aufgerufen
		System.out.println(Arrays.toString(test));//Sollte nun [1, 2, 42, 4, 5] ausgeben
	}
}