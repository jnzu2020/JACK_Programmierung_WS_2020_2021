import java.util.Arrays;

public class ArraySchreiben {
	// Aufgabe 1
	public static int[] createArray(int laenge)	{
		int[] array = new int[laenge];
		//hier beginnt der zu bearbeitende Bereich
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = i;
		}
		return array;
		//hier endet der zu bearbeitende Bereich
	}
	
	//In der Main Methode kannst du dir auch eigene Testfaelle ausdenken und testen
	public static void main(String[] args) {
		System.out.println("Hier sollte '[0]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(1)));
		System.out.println("Hier sollte '[0, 1]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(2)));
		System.out.println("Hier sollte '[0, 1, 2]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(3)));
		System.out.println("Hier sollte '[0, 1, 2, 3]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(4)));
		System.out.println("Hier sollte '[0, 1, 2, 3, 4]' stehen. Bei Ihnen steht: " + Arrays.toString(createArray(5)));
	}
}