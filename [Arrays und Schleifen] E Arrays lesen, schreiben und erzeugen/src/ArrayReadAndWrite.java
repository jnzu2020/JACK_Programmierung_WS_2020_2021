/*
 * In dieser Aufgabe geht es darum das erste mal mit Arrays zu arbeiten.
 * Implementieren Sie die Methoden addArrayElements und neighbourNumbers.
 * Die Verwendung einer Schleife ist in dieser Aufgabe NICHT notwendig.
 */
public class ArrayReadAndWrite {
	// Die Methode addElementsOfArray erwartet ein IntegerArray mit zwei
	// Elementen. Rueckgabewert soll die Summe der beiden Arrayelemente sein.
	public static int addElementsOfArray(int[] numbers){
		
		return numbers[0] + numbers[1];
	}
	
	// Diese Methode soll auf eine Eingabe hin ein IntegerArray erzeugen und
	// zurueckgeben. Die Eingabe ist eine ganze Zahl n und das Array soll die
	// zwei Elemente enthalten. Das erste Element soll n-1 sein, das zweite n+1.
	public static int[] neighbourNumbers(int number){
		int[] numbers = new int[2];
		numbers[0] = number - 1;
		numbers[1] = number + 1;
		return numbers;
	}
	
	// Testausgabe. Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {
		int zahlenArray[]	= new int[]{5,17};
		System.out.println("Summe der Arrayelemente: "
						   + addElementsOfArray(zahlenArray));
		int zahl = 3;
		int ergebnisArray[]	= neighbourNumbers(zahl);
		System.out.println("Kleiner Nachbar der Zahl " + zahl +
						   ": " + ergebnisArray[0] +
						   "\nGro�er Nachbar der Zahl " + zahl +
						   ": " + ergebnisArray[1]);
	}
}