
public class List {

	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement) {
		if (head == null) {
			head = newElement;
		} else {
			Element current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newElement);
		}
	}

	// Aufgabe 2
	public int getSize() {
		int size = 0;
		if (head == null) {
			return 0;
		} else {
			Element current = head;
			while (current != null) {
				size++;
				current = current.getNext();
			}
			return size;
		}
	}

	// Aufgabe 3
	public void increase() {
		Element current = head;
		while (current != null) {
			current.increaseByOne();
			current = current.getNext();
		}
	}

	// Aufgabe 4
	public void deleteElement() {
		head = head.getNext();
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(START_LABEL);

		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getValue());
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
}
