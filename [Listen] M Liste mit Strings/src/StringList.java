public class StringList {
	// Das erste Element der Liste
	private StringListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(String string) {
		StringListElement newElement = new StringListElement();
		newElement.setString(string);
		if (first == null) {
			first = newElement;
		} else {
			StringListElement current = first;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			newElement.setPrev(current);
			current.setNext(newElement);
		}
	}

	// Aufgabe 2
	public void insert(String string, int index) {
		StringListElement newElement = new StringListElement();
		newElement.setString(string);
		if (index == 0) {
			if (first != null) {
				first.setPrev(newElement);
			}
			newElement.setNext(first);
			first = newElement;
		} else {
			StringListElement previous = null;
			StringListElement current = first;
			int currentIndex = 0;
			while (currentIndex < index) {
				previous = current;
				current = current.getNext();
				currentIndex++;
			}
			if (current != null) {
				newElement.setNext(current);
				current.setPrev(newElement);
			}
			previous.setNext(newElement);
			newElement.setPrev(previous);
		}
	}

	// Aufgabe 3
	public String get(int index) {
		if (index == 0) {
			return first.getString();
		}
		StringListElement current = first;
		int currentIndex = 0;
		while (currentIndex < index) {
			current = current.getNext();
			currentIndex++;
		}
		return current.getString();
	}

	// Aufgabe 4
	public void remove(int index) {
		if (index == 0) {
			first = first.getNext();
		} else {
			StringListElement previous = null;
			StringListElement current = first;
			int currentIndex = 0;
			while (currentIndex < index) {
				previous = current;
				current = current.getNext();
				currentIndex++;
			}
			if (current.getNext() != null) {
				current.getNext().setPrev(previous);
			}
			previous.setNext(current.getNext());
		}
	}

	/*
	 * Ende des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		StringList liste = new StringList();
		liste.append("Hallo");
		liste.append("Welt");
		liste.append("!");
		System.out.println("Erwartete Ausgabe: first --> \"Hallo\" <--> \"Welt\" <--> \"!\" --> null");
		System.out.println(liste);
		liste.remove(0);
		liste.remove(0);
		liste.remove(0);
		System.out.println("Erwartete Ausgabe: first --> null");
		System.out.println(liste);
		liste.append("ist");
		liste.append("!");
		liste.insert("Dieser", 0);
		liste.insert("falsch", 2);
		liste.insert("Satz", 1);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Dieser\" <--> \"Satz\" <--> \"ist\" <--> \"falsch\" <--> \"!\" --> null");
		System.out.println(liste);
		liste = new StringList();
		liste.insert("Test1", 0);
		liste.insert("Test2", 1);
		System.out.println("Erwartete Ausgabe: first --> \"Test1\" <--> \"Test2\" --> null");
		System.out.println(liste);
		liste.append("Test3");
		liste.append("Test4");
		liste.append("Test5");
		liste.append("Test6");
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test1\" <--> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(0);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" <--> \"Test6\" --> null");
		System.out.println(liste);
		liste.remove(4);
		System.out.println(
				"Erwartete Ausgabe: first --> \"Test2\" <--> \"Test3\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		liste.remove(1);
		System.out.println("Erwartete Ausgabe: first --> \"Test2\" <--> \"Test4\" <--> \"Test5\" --> null");
		System.out.println(liste);
		System.out.println("Erwartete Ausgabe: Test2");
		System.out.println(liste.get(0));
		System.out.println("Erwartete Ausgabe: Test4");
		System.out.println(liste.get(1));
		System.out.println("Erwartete Ausgabe: Test5");
		System.out.println(liste.get(2));
	}

	public String toString() {
		String liste = "first --> ";
		StringListElement element = first;
		while (element != null) {
			liste = liste + "\"";
			liste = liste + element.getString();
			liste = liste + "\"";
			if (element.getNext() != null) {
				liste = liste + " <--> ";
			} else {
				liste = liste + " --> ";
			}
			element = element.getNext();
		}

		liste = liste + "null";

		return liste;
	}
}