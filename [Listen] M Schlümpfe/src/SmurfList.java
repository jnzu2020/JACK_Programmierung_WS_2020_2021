public class SmurfList {
	
	public static final int SMURF_MAXIMAL_SIZE = 20;
	public static final int SMURF_MINIMAL_SIZE = 8;

	public SmurfNode head;
	
	public SmurfList(){
		head = null;
	}
	
	public SmurfNode getHead(){
		return head;
	}
	
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	
	// Aufgabe1
	public void addSmurf(Smurf smurf){
		int smurfSize = smurf.getSize();
		if (smurfSize >= SMURF_MINIMAL_SIZE && smurfSize <= SMURF_MAXIMAL_SIZE) {
			SmurfNode newNode = new SmurfNode(smurf, null);
			if (head == null) {
				head = newNode;
			} else if (smurfSize < head.getSmurf().size) {
				newNode.setNext(head);
				head = newNode;
			} else {
				SmurfNode previous = null;
				SmurfNode current = head;
				while (current != null) {
					if (current.getSmurf().size < smurfSize) {
						previous = current;
						current = current.getNext();
					} else {
						break;
					}
				}
				if (current != null) {
					newNode.setNext(current);
				}
				previous.setNext(newNode);
			}
		}
	}
	
	// Aufgabe 2
	public boolean containsSmurf(Smurf smurf){
		if (head == null) {
			return false;
		}
		SmurfNode current = head;
		while (current != null) {
			Smurf currentSmurf = current.getSmurf();
			if ((currentSmurf.getName().equals(smurf.getName())) && (currentSmurf.getSize() == smurf.getSize())) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	// Aufgabe 3
	public int smurfPosition(Smurf smurf){
		if (head == null) {
			return -1;
		}
		SmurfNode current = head;
		int currentIndex = 1;
		while (current != null) {
			Smurf currentSmurf = current.getSmurf();
			if (currentSmurf.getName().equals(smurf.getName()) && currentSmurf.getSize() == smurf.getSize()) {
				return currentIndex;
			}
			current = current.getNext();
			currentIndex++;
		}
		return -1;
	}
	
	// Aufgabe 4
	public int smurfPosition(String name){
		if (head == null) {
			return -1;
		}
		SmurfNode current = head;
		int currentIndex = 1;
		while (current != null) {
			Smurf currentSmurf = current.getSmurf();
			if (currentSmurf.getName().compareTo(name) == 0) {
				return currentIndex;
			}
			current = current.getNext();
			currentIndex++;
		}
		return -1;
	}
	
	// Aufgabe 5
	public void downsizeSmurfs(int cm){
		SmurfNode current = head;
		while (current != null) {
			Smurf currentSmurf = current.getSmurf();
			int newSize = currentSmurf.getSize() - cm;
			if (newSize >= SMURF_MINIMAL_SIZE) {
				currentSmurf.setSize(newSize);
			} else {
				removeSmurf(currentSmurf);
			}
			current = current.getNext();
		}
	}
	
	// Aufgabe 6
	public void stretchSmurfs(int cm){
		SmurfNode current = head;
		while (current != null) {
			Smurf currentSmurf = current.getSmurf();
			int newSize = currentSmurf.getSize() + cm;
			if (newSize <= SMURF_MAXIMAL_SIZE) {
				currentSmurf.setSize(newSize);
			} else {
				removeSmurf(currentSmurf);
			}
			current = current.getNext();
		}
	}

	private void removeSmurf(Smurf smurf) {
		Smurf headSmurf = head.getSmurf();
		if ((headSmurf.getName().equals(smurf.getName())) && (headSmurf.getSize() == smurf.getSize())) {
			head = head.getNext();
		} else {
			SmurfNode previous = null;
			SmurfNode current = head;
			while (current != null) {
				Smurf currentSmurf = current.getSmurf();
				if (currentSmurf.getName().equals(smurf.getName()) && currentSmurf.getSize() == smurf.getSize()) {
					previous.setNext(current.getNext());
					return;
				}
				previous = current;
				current = current.getNext();
			}
		}
	}
	
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	
	
	// Mit dieser Methode koennen Sie die Namen aller Schluempfe in einer
	// Schlumpfliste ausgeben lassen. Sie soll eine Hilfestellung sein um ihre
	// Tests in der "public static void main" zu erleichtern.
	// Den Inhalt einer Schlumpfliste "liste" koennen Sie mit dem Befehl
	//
	//                printSchlumpfListe(liste);
	//
	// auf der Konsole ausgeben lassen.
	public static void printSmurfList(SmurfList slist){
		SmurfNode iterator = slist.getHead();
		while (iterator != null){
			if (iterator.smurf != null){
				System.out.print(iterator.getSmurf().getName() + ", ");
			} else {
				System.out.print("NULL, ");
			}
			iterator = iterator.getNext();
		}
		System.out.println();
	}
	
	/*
	 * Hier kommt ihr Testcode hin
	 */
	public static void main(String[] args) {

	}
}