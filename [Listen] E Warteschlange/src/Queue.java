public class Queue {
	QueueNode first;
	QueueNode last;
	
	public void Warteschlange(){
		first	= null;
		last	= null;
	}
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	// Aufgabe 1
	public void push(int number){
		QueueNode newQueueNode = new QueueNode(number, null);
		if (first == null) {
			first = newQueueNode;
			last = newQueueNode;
		} else {
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newQueueNode);
			last = last.getNext();
		}
	}
	// Aufgabe 2
	public int pop(){
		if (first == null) {
			return Integer.MIN_VALUE;
		} else if (length() == 1) {
			int value = first.getNumber();
			first = null;
			last = null;
			return value;
		} else {
			int value = first.getNumber();
			first = first.getNext();
			return value;
		}
	}
	// Aufgabe 3
	public int length(){
		int length = 0;
		QueueNode current = first;
		while (current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}
	// Aufgabe 4
	public int sum(){
		if (first == null) {
			return 0;
		} else {
			int sum = 0;
			QueueNode current = first;
			while (current != null) {
				sum += current.getNumber();
				current = current.getNext();
			}
			return sum;
		}
	}
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	/*
	 * Testen Sie hier Ihre Implementierung.
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(4);		// Inhalt der Warteschlange: (4)
		queue.push(17);		// Inhalt der Warteschlange: (4, 17)
		queue.pop();		// ...                       (17)
		queue.push(33);		// 							 (17, 33)
		queue.push(-13);	//							 (17, 33, -13)
		queue.pop();		//							 (33, -13)
		System.out.println("Erwartete Länge der Warteschlange: 2");
		System.out.println("Tatsächliche Länge:               " + queue.length());
		System.out.println();
		System.out.println("Erwartete Summe über der Warteschlange: 20");
		System.out.println("Tatsächliche Summe:                     " + queue.sum());
	}
//
//	public void print() {
//		QueueNode current = first;
//		while (current != null) {
//			System.out.print(current.getNumber() + " ---> ");
//			current = current.getNext();
//		}
//	}
}
