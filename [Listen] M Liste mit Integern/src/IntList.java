public class IntList {

	// Das erste Element der Liste.
	private IntListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(int number) {
		IntListElement newElement = new IntListElement();
		newElement.setNumber(number);
		if (first == null) {
			first = newElement;
		} else if (first.getNumber() > number) {
			newElement.setNext(first);
			first = newElement;
		} else {
			IntListElement previous = null;
			IntListElement current = first;
			while (current!= null && current.getNumber() < number) {
				previous = current;
				current = current.getNext();
			}
			newElement.setNext(current);
			previous.setNext(newElement);
		}
	}

	// Aufgabe 2
	public int size() {
		int size = 0;
		IntListElement current = first;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	// Aufgabe 3
	public int get(int index) {
		if (index < 0 || index >= size()) {
			return 0;
		}
		IntListElement current = first;
		int currentIndex = 0;
		while (currentIndex < index) {
			current = current.getNext();
			currentIndex++;
		}
		if (current != null) {
			return current.getNumber();
		} else {
			return 0;
		}
	}

	// Aufgabe 4
	public void reverse() {
		IntListElement previous = null;
		IntListElement current = first;
		IntListElement next = first.getNext();
		while (next != null) {
			current.setNext(previous);
			previous = current;
			current = next;
			next = current.getNext();
		}
		current.setNext(previous);
		first = current;

	}

	/*
	 * ENDE des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		IntList l = new IntList();
		l.append(10);
		l.append(20);
		l.append(42);
		l.append(-10);
		l.append(30);
		System.out.println("So sieht die Liste aus: " + l);
		System.out.println("Das Element an Index 0: " + l.get(0));
		System.out.println("Das Element an Index -10 (Gibt es nicht, sollte also 0 sein): " + l.get(-10));
		System.out.println("Das Element an Index 100 (Gibt es nicht, sollte also 0 sein): " + l.get(100));
		System.out.println("Das Element an Index 2: " + l.get(2));
		System.out.println("Die Liste hat " + l.size() + " Elemente.");
		l.reverse();
		System.out.println("Liste wurde gedreht");
		System.out.println("Nun sieht die Liste so aus: " + l);
	}

	public String toString() {
		String liste = "first --> ";
		IntListElement element = first;
		while (element != null) {
			liste = liste + element.getNumber();
			liste = liste + " --> ";
			element = element.getNext();
		}
		liste = liste + "null";
		return liste;
	}
}