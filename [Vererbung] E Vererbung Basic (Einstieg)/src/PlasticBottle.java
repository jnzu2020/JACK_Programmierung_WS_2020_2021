               //Aufgabe 1
public class PlasticBottle extends Bottle {

	// Aufgabe 1
	public PlasticBottle(double liter, String brand) {
		super(liter, brand);
	}

	// Aufgabe 2
	public double deposit() {
		if ("Geotaler".equals(getBrand())) {
			return 0.5 + getLiter();
		} else {
			return 0.25;
		}
	}

}
