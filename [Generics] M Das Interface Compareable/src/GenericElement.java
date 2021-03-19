import java.util.Comparator;

// ---------------- Aufgabe 2 ----------------------
public class GenericElement<T extends Comparable> implements Comparable<GenericElement<T>> {    // Die Klassendeklaration muss noch angepasst werden.
	
	private GenericElement next;
	private T value;  // Soll generisch werden.
	
	public GenericElement(T value, GenericElement next) {
		this.value = value;
		this.next = next;
	}
	
	public GenericElement getNext() {	
		return next;
	}
	
	public void setNext(GenericElement next) {
		this.next = next;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	// Die Methode compareTo soll hier implementiert werden.
	// Zu bearbeitender Bereich:
	@Override
	public int compareTo(GenericElement<T> o) {
		return value.compareTo(o.getValue());
	}
	//Ende des zu bearbeitenden Bereichs
}
