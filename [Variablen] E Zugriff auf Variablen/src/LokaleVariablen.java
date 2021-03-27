public class LokaleVariablen {
	public int number;
	private int newNumber;

	public LokaleVariablen() {
		number = 10;
	}

	// ------------------ Aufgabe 1---------------------
		public int returnTen(int a) {
            int ten = a;
			if (a < 10) {
				while (ten < 10) {
					ten++;
				}
			} else if (a > 10) {
				while (ten > 10) {
					ten--;
				}
			}
			return ten;
		}	

	// ------------------ Aufgabe 2 ---------------------
	public void setNewNumber(Integer a) {
		this.newNumber = a;
	}

	public Integer getNewNumber() {
		return this.newNumber;
	}
	
	// ------------------ Aufgabe 3 ---------------------
	public void increase(int number) {
		this.number += number;
	}

	
	

}
