public class LokaleVariablenMain {
	static LokaleVariablen local = new LokaleVariablen();
	
	public static void main(String[] args) {
		System.out.println("Test für Aufgabe 1:");
		System.out.println("Erwartete Ausgabe: 10 | Deine Ausgabe:");
		tenTest();
		
		System.out.println("Test für Aufgabe 2:");
		System.out.println("Erwartete Ausgabe: 25 | Deine Ausgabe:");
		newNumberTest();
		System.out.println("");

		System.out.println("Test für Aufgabe 3:");
		System.out.println("Erwartete Ausgabe: 15 | Deine Ausgabe:");
		increaseTest();
		System.out.println("");
		
		
	}

	public static void increaseTest() {
		local.increase(5);
		System.out.println(local.number);
	}
	
	public static void newNumberTest() {
		local.setNewNumber(25);
		System.out.println(local.getNewNumber());
	}
	
	public static void tenTest() {
		System.out.println(local.returnTen(25));
	}


}
