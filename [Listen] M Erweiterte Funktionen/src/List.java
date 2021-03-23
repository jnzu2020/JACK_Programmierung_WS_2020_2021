public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement, int position) {
		if (position > 0 && position <= getSize() + 1) {
			if (head == null) {
				head = newElement;
			} else if (position == 1) {
				newElement.setNext(head);
				head = newElement;
			} else {
				int currentIndex = 1;
				Element current = head;
				while (currentIndex < position - 1) {
					current = current.getNext();
					currentIndex++;
				}
				newElement.setNext(current.getNext());
				current.setNext(newElement);
			}
		}
	}

	// Aufgabe 2
	public int getPosition(Element wanted) {
		if (head == null) {
			return 0;
		}
		int currentIndex = 1;
		Element current = head;
		while (current != null) {
			if ((current.getName().equals(wanted.getName())) && (current.getValue() == wanted.getValue())) {
				return currentIndex;
			}
			current = current.getNext();
			currentIndex++;
		}
		return 0;
	}

	// Aufgabe 3
	public String getName(int position) {
		if (position > 0 && position <= getSize() + 1) {
			if (head == null) {
				return null;
			} else {
				int currentIndex = 1;
				Element current = head;
				while (current != null) {
					if (currentIndex < position) {
						current = current.getNext();
						currentIndex++;
					} else {
						return current.getName();
					}
				}
			}
		}
		return null;
	}

	// Aufgabe 4
	public void deleteElement() {
		if (head != null) {
			if (getSize() == 1) {
				clearList();
			} else {
				Element previous = head;
				Element current = head;
				while (current.getNext() != null) {
					previous = current;
					current = current.getNext();
				}
				previous.setNext(null);
			}
		}
	}

	// ------------- HILFSMETHODEN ---------------

	// Methode zum Ausgeben der Anzahl der Elemente in der Liste.
	public int getSize() {
		int count = 0;
		Element pointer = head;
		while (pointer != null) {
			count++;
			pointer = pointer.getNext();
		}
		return count;
	}

	// Methode zum Einfuegen eines neuen Elementes am Ende der Liste.
	public void addElement(Element newElement) {
		if (head == null) {
			head = newElement;
		} else {
			Element pointer = this.head;
			while (pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(newElement);
		}
	}

	// Methode, die die komplette Liste löscht.
	public void clearList() {
		head = null;
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(START_LABEL);
		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		str.append("---> null");
		return str.toString();
	}
}