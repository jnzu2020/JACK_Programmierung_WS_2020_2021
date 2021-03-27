//	-------------------- Aufgabe 3 --------------------
// Aufgabe 3 a)
public class Student extends Human {
	
	private int matrikelNr;
	
	// Aufgabe 3 a)
	public Student(boolean earlyRiser, String nation, int mat) {
		super(earlyRiser, nation);
		this.matrikelNr = mat;
	}
	
	// Aufgabe 3 b)

	@Override
	public double bedTime() {
		double time = super.bedTime() + 2;
		if (time > 24) {
			time = 24;
		}
		return time;
	}

	// Aufgabe 3 c)
	public boolean under18 () {
		return getAge() < 18;
	}
	
	// Ende des zu bearbeitenden Bereichs
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
}
