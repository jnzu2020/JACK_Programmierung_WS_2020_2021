import java.util.Arrays;

public class Sorter {

	/*
	 * Diese Methode bekommt ein int[] uebergeben und soll dieses sortieren.
	 * Dabei soll aber nur eine Kopie bearbeitet werden, das uebergebene Array soll
	 * seine Elemente behalten. Die sortierte Kopie wird dann zurueckgegeben.
	 * Hierbei sollen die Zahlen in aufsteigender Reihenfolge sortiert sein.
	 * Beispiel: sort({10,5,42,17,108}) --> {5,10,17,42,108}
	 */
	public int[] sort(int[] toSort)
	{
		int[] result = toSort.clone();
		sort2(result);
		return result;
	}
	
	/*
	 * Diese Methode soll das uebergebene Array auch sortieren, allerdings soll diesmal direkt das Array
	 * sortiert werden und keine Kopie angelegt werden. Entsprechend hat diese Methode auch
	 * keinen Rueckgabewert.
	 * Beispiel:
	 * int[] a = new int[]{10,5,42,17,108};
	 * sort2(a);
	 * --> a ist jetzt {5,10,17,42,108}
	 */
	public void sort2(int[] toSort)
	{
		for (int i = 0 ; i < toSort.length ; i++) {
			for (int j = 0 ; j < toSort.length - i - 1 ; j++) {
				if (toSort[j] > toSort[j + 1]) {
					int temp = toSort[j];
					toSort[j] = toSort[j + 1];
					toSort[j + 1] = temp;
				}
			}
		}
	}
	
	/*
	 * Die Main Methode zum Testen deiner Methoden.
	 */
	public static void main(String[] args) {
		int[] toSort = new int[]{10,5,42,17,108};
		Sorter sort = new Sorter();
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		System.out.println("Das Ergebnis: "+Arrays.toString(sort.sort(toSort)));
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		sort.sort2(toSort);
		System.out.println("Das Ergebnis: "+Arrays.toString(toSort));
	}
}
