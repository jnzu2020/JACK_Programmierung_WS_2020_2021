//	-------------------- Aufgabe 1 --------------------
// A)
public class Skyscraper extends Building {

	private int apartments;

	public Skyscraper(int apartments) {
		this.apartments = apartments;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.-----

	@Override
	public int rentalCosts() {
		int cost = 100 * getPlotArea() - 300 * apartments;
		return Math.max(cost, 300);
	}

	@Override
	protected void setPlotArea(int plotArea) {
		if (plotArea < 20 || plotArea > 80) {
			setPlotArea(35);
		} else {
			super.setPlotArea(plotArea);
		}
	}
}
