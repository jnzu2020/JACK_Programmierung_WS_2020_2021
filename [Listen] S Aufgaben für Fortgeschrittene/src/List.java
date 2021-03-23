public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	//Aufgabe 1
	public void addList(List newList) {
		if (head == null) {
			head = newList.head;
		} else {
			Element current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newList.head);
		}
	}

	//Aufgabe 2
	public void moveElement(int prevPos, int afterPos) {
		if ((head != null) && (prevPos > 0 && prevPos <= getSize()) && (afterPos > 0 && afterPos <= getSize())) {
			Element elementBeforeTarget = head;
			Element elementBeforeNewPos = head;
			Element current = head;
			int currentIndex = 1;
			while (currentIndex < prevPos) {
				elementBeforeTarget = current;
				current = current.getNext();
				currentIndex++;
			}
			Element moveTargetElement = current;
			current = head;
			currentIndex = 1;
			while (currentIndex < afterPos) {
				elementBeforeNewPos = current;
				current = current.getNext();
				currentIndex++;
			}
			if (afterPos == 1) {
				elementBeforeTarget.setNext(moveTargetElement.getNext());
				moveTargetElement.setNext(head);
				head = moveTargetElement;
			} else if (prevPos == 1) {
				head = head.getNext();
				elementBeforeTarget.setNext(moveTargetElement.getNext());
				moveTargetElement.setNext(current.getNext());
				current.setNext(moveTargetElement);
			} else if (prevPos > afterPos){
				elementBeforeTarget.setNext(moveTargetElement.getNext());
				moveTargetElement.setNext(elementBeforeNewPos.getNext());
				elementBeforeNewPos.setNext(moveTargetElement);
			} else if (prevPos < afterPos) {
				elementBeforeTarget.setNext(moveTargetElement.getNext());
				moveTargetElement.setNext(current.getNext());
				current.setNext(moveTargetElement);
			}
		}
	}

	//Aufgabe 3
	public void filterElements(int threshold) {
		Element previous = null;
		Element current = head;
		while (current != null) {
			if (current.getValue() > threshold) {
				if (current == head) {
					head = current.getNext();
					current = head;
				} else {
					previous.setNext(current.getNext());
					current = previous.getNext();
				}
			} else {
				previous = current;
				current = current.getNext();
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

	// Methode, die die komplette Liste loescht.
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
			str.append(" (" + pointer.getValue() + ")");
			pointer = pointer.getNext();
		}
		str.append("---> null");
		return str.toString();
	}
}