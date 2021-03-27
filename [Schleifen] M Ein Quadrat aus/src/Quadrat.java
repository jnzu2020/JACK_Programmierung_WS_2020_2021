public class Quadrat {
	/*
	 * Diese Methode soll ein Quadrat aus * zurueckgeben in Form eines Strings mit der angegebenen Kantenlaenge.
	 * Dieses Quadrat soll dann zum Beispiel wie folgt aussehen:
	 *  *****
	 *  *****
	 *  *****
	 *  *****
	 *  *****
	 * Also eine Reihe aus Kantenlaenge *, dann ein Zeilenumbruch, dann eine weitere Reihe, ...
	 * Am Ende des Strings steht KEIN Zeilenumbruch mehr.
	 * Das Zeichen fuer einen Zeilenumbruch ist dieses hier: \n (ein \ gefolgt von einem n)
	 */
	 
	public static String macheQuadrat(int kantenlaenge)	{
		StringBuilder str = new StringBuilder();
		for (int i = 0 ; i < kantenlaenge ; i++) {
			for (int j = 0 ; j < kantenlaenge ; j++) {
				str.append("*");
			}
			str.append("\n");
		}
		str.setLength(str.length() - 1);
		return str.toString();
	}
	
	// Beispielmethode: So sieht die korrekte Loesung fuer Kantenlaenge = 2 aus.
	public static String beispiel()	{
		return "**\n**";
	}
	
	// Die main Methode. Hier kannst du deine Methode testen. Du kannst auch eigene Testfaelle schreiben.
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(macheQuadrat(1));
		System.out.println();
		System.out.println(macheQuadrat(2));
		System.out.println();
		System.out.println(macheQuadrat(3));
		System.out.println();
		System.out.println(macheQuadrat(4));
		System.out.println();
		System.out.println(macheQuadrat(5));
		System.out.println();
	}
}