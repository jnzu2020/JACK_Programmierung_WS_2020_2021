public class RecursiveWordList {
	
	private WordNode head;
	
	/*
	 * Die folgenden drei Methoden sind von Ihnen nicht zu bearbeiten.
	 * Sie implementieren in einer iterativen Weise die Funktionalitaet, die Sie
	 * mit rekursiven Methoden realisieren muessen.
	 */
	
	// Rueckgabe des Inhalts der gesamten Liste als zusammenhaengender String
	public String toStringIterative(){
		String sentence = "";
		WordNode current = head;
		while (current != null){
			if (sentence.length() != 0){
				sentence += " ";
			}
			sentence += current.getWord();
			current = current.getNext();
		}
		return sentence;
	}
	
	// Anhaengen eines Wortes ans Ende der Liste
	public void appendWordIterative(String word){
		if (head == null){
			head = new WordNode(word);
		} else {
			WordNode current = head;
			while (current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(new WordNode(word));
		}
	}
	
	// Rueckgabe des Strings eines Wortes an der durch index gegebenen Stelle.
	// Das erste Wort in der Liste hat den Index 0
	public String getWordAtIterative(int index){
		WordNode currentNode	= head;
		int currentIndex		= 0;
		while (currentIndex < index && currentNode != null){
			currentNode	= currentNode.getNext();
			currentIndex++;
		}
		if (currentNode != null){
			return currentNode.getWord();
		} else {
			return null;
		}
	}
	
	//================================
	// BEGINN des zu aendernden Codes
	//================================
	
	// Aufgabe 1
	public void appendWord(String word){
		if (head == null) {
			head = new WordNode(word);
		} else {
			appendWord(word, head);
		}
	}
	
	// Aufgabe 1
	private void appendWord(String word, WordNode node){
		if (node.getNext() == null) {
			node.setNext(new WordNode(word));
		} else {
			appendWord(word, node.getNext());
		}
	}
	
	
	// Aufgabe 2
	public String getWordAt(int index){
		if (head == null || index < 0 || index > getSize()) {
			return null;
		}
		return getWordAt(index, head);
	}
	
	// Aufgabe 2
	private String getWordAt(int index, WordNode node){
		if (index == 0) {
			return node.getWord();
		}
		return getWordAt(index - 1, node.getNext());
	}
	
	
	// Aufgabe 3
	public String toString(){
		if (head == null) {
			return "";
		}
		return toString(head);
	}
	
	// Aufgabe 3
	private String toString(WordNode node){
		if (node.getNext() != null) {
			return node.getWord() + " " + toString(node.getNext());
		} else {
			return node.getWord();
		}
	}
	
	//===================================
	// ENDE des zu aendernden Codes
	//===================================
	
	public static void main(String[] args) {
		System.out.println("Die folgenden Ausgaben zeigen die Ergebnisse der "
				+ "vorgegebenen iterativen Methoden, gefolgt von den "
				+ "Ergebnissen Ihrer Methoden.\nSollten die Ergebnisse Ihrer "
				+ "Methoden abweichen, verbirgt sich noch ein Fehler in ihnen."
				+ "\n");
		
		// Testfall fuer appendWord(String word)
		RecursiveWordList	rwlIter	= new RecursiveWordList();
		RecursiveWordList	rwlRec	= new RecursiveWordList();
		rwlIter.appendWordIterative("Rekursion");
		rwlRec.appendWordIterative("Rekursion");
		rwlIter.appendWordIterative("ist");
		rwlRec.appendWordIterative("ist");
		System.out.println("Test 1: appendWord(String word)\n"
						 + "===============================");
		System.out.println("AusgangsListe:\n"
						 + "--------------");
		System.out.println(rwlIter.toStringIterative());
		
		rwlIter.appendWordIterative("toll");
		rwlRec.appendWord("toll");
		System.out.println("\nAufruf von appendWord(\"toll\") auf der Liste.\n"
				+ "Sollzustand gefolgt vom durch Ihre Methode erzeugten Zustand:");
		System.out.println("----------------------");
		System.out.println(rwlIter.toStringIterative());
		System.out.println(rwlRec.toStringIterative());
		System.out.println("\n");
		
		//Testfall fuer toString()
		rwlIter	= new RecursiveWordList();
		rwlIter.appendWordIterative("Rekursion");
		rwlIter.appendWordIterative("ist");
		rwlIter.appendWordIterative("toll");
		System.out.println("Test 2: appendWord\n"
						 + "==================");
		System.out.println("AusgangsListe:\n"
						 + "--------------");
		System.out.println(rwlIter.toStringIterative());
		
		System.out.println("\nRueckgabe von toString() auf der Liste:");
		System.out.println(rwlIter.toString());
		System.out.println("\n");
		
		//Testfall fuer getWordAt(int index)
		rwlIter	= new RecursiveWordList();
		rwlIter.appendWordIterative("Rekursion");
		rwlIter.appendWordIterative("ist");
		rwlIter.appendWordIterative("toll");
		System.out.println("Test 3: getWordAt(index)\n"
						 + "========================");
		System.out.println("AusgangsListe:\n"
						 + "--------------");
		System.out.println(rwlIter.toStringIterative());
		
		System.out.println("\nRueckgabe von getWordAt(1) auf der Liste.\n"
				+ "Sollrueckgabe gefolgt von der Rueckgabe Ihrer Methode:");
		System.out.println("----------------");
		System.out.println(rwlIter.getWordAtIterative(1));
		System.out.println(rwlIter.getWordAt(1));
	}
	
	/*
	 * Beispiel fuer eine rekursive Ermittlung der Groesse der Wortliste.
	 * 
	 * Von aussen sichtbar ist die nur erste Methode getSize(). Die Methode
	 * getSize(). Die eigentlich Ermittlung der Listengroesse geschieht in der
	 * zweiten Methode getSize(WordNode node).
	 * Die zweite Methode wird mit einem Knoten als Parameter aufgerufen. Die
	 * Methode getSize(WordNode node) prueft, ob es sich bei dem uebergebenen
	 * Parameter um ein echtes Listenelement oder um einen Zeiger auf null
	 * handelt. Wenn es sich um einen Zeiger auf null handelt, ist die Laenge
	 * der von dort verbleibenden Liste 0, die Methode gibt also 0 zurueck.
	 * Handelt es sich jedoch um echtes Listenelement wird die Laenge der dort
	 * angehaengten Restliste ( getSize(node.getNext) ) ermittelt und um 1
	 * erhoeht ( getSize(node.getNext()) + 1 ).
	 * Wenn die Methode mit dem ersten Element der Liste, head, aufgerufen wird,
	 * wird fuer jedes Listenelement ueber den jeweiligen Nachfolger des aktuell
	 * betrachteten Elements node ein Aufruf der Methode getSize(WordNode node)
	 * ausgefuehrt, und damit auch jeweils 1 auf die Zahl der betrachteten
	 * Elemente addiert.
	 * Der Aufruf von getSize(head) liefert also tatsaechlich die Groesse der
	 * Liste.
	 * Da head aber nicht von aussen sichtbar ist, wird fuer den Zugriff von
	 * aussen noch die unparametrisierte Methode getSize() angeboten. Diese
	 * Methode stellt auch sicher, dass getSize(WordNode node) mit dem korrekten
	 * Parameter head aufgerufen wird.
	 * 
	 * Um den Vorgang zu demonstrieren wird hier ein sogennanter CallStack
	 * verwendet. Auf einem CallStack befinden sich alle bislang aufgerufenen
	 * und noch nicht beendeten Methoden.
	 * 
	 * Beispielliste (2 Elemente):
	 * 
	 * head = "ich" --> "Liste" --> null
	 * 
	 * Aufruf von getSize():
	 * 
	 * CallStack:
	 * getSize()
	 * 
	 * 
	 * getSize ruft getSize(WordNode node) mit dem Parameter head auf:
	 * 
	 * CallStack:
	 * getSize()
	 *   getSize("ich" (= head))
	 * 
	 * getSize(WordNode node) ruft getSize(WordNode node) mit dem Parameter
	 * node.getNext() auf:
	 * 
	 * CallStack:
	 * getSize()
	 *   getSize("ich" (= head))
	 *     getSize("Liste")
	 * 
	 * 
	 * getSize(WordNode node) ruft getSize(WordNode node) mit dem Parameter
	 * node.getNext() auf:
	 * 
	 * CallStack:
	 * getSize()
	 *   getSize("ich" (= head))
	 *     getSize("Liste")
	 *       getSize(null)
	 *       
	 * 
	 * getSize(WordNode node) auf der untersten Ebene gibt 0 zurueck
	 * 
	 * CallStack:
	 * getSize()
	 *   getSize("ich" (= head))
	 *     getSize("Liste")
	 *     
	 *     
	 * getSize(WordNode node) auf der untersten Ebene erhaelt 0 vom Aufruf von
	 * getSize(WordNode node) zurueck und gibt selbst 0 + 1 = 1 zurueck
	 * 
	 * CallStack:
	 * getSize()
	 *   getSize("ich" (= head))
	 *   
	 *   
	 * getSize(WordNode node) auf der untersten Ebene erhaelt 1 vom Aufruf von
	 * getSize(WordNode node) zurueck und gibt selbst 1 + 1 = 2 zurueck
	 * 
	 * CallStack:
	 * getSize()
	 * 
	 * 
	 * getSize() erhaelt 2 vom Aufruf von getSize(WordNode node) zurueck und
	 * gibt selbst den gleichen Wert zurueck.
	 */
	
	public int getSize(){
		return getSize(head);
	}
	
	private int getSize(WordNode node){
		if (node == null){
			return 0;
		} else {
			return getSize(node.getNext()) + 1;
		}
	}
}
