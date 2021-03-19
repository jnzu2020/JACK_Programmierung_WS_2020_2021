import java.util.Arrays;

/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorangestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */
public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// Arrays addieren und die Gesamtsumme zurueckgeben.
	public static int sum(final int[] elements){
		int sum = 0;
		for (int element : elements) {
			sum += element;
		}
		return sum;
	}
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		int maxElement = elements[0];
		int maxIndex = 0;
		for (int i = 0 ; i < elements.length ; i++) {
			if (maxElement < elements[i]) {
				maxElement = elements[i];
				maxIndex = i;
			}
		}
		return maxElement * maxIndex;
	}

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Übergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements){
		int[] newElements = new int[elements.length * 2];
		for (int i = 0 , j = 0 ; i < newElements.length ; i += 2 , j++) {
			newElements[i] = elements[j];
			newElements[i + 1] = elements[j];
		}
		return newElements;
	}
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		int[] newElements = new int[elements.length];
		for (int i = 0 ; i < newElements.length ; i++) {
			newElements[i] = elements[i] * elements[i];
		}
		return newElements;
	}
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void reverseArray(int[] elements){
		for (int i = 0 , j = elements.length - 1 ; i < elements.length / 2 ; i++ , j--) {
			int temp = elements[i];
			elements[i] = elements[j];
			elements[j] = temp;
		}
	}

	// Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {

	}
}