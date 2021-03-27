//	-------------------- Aufgabe 2 --------------------
// A)
public class FamilyHome extends Building {

	private int inhabitants;

	public FamilyHome(int inhabitants) {
		this.inhabitants = inhabitants;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.------

	@Override
	public int rentalCosts() {
		int cost = 50 * getPlotArea() - 100 * inhabitants;
		return Math.max(cost, 600);
	}

	@Override
	protected void setPlotArea(int plotArea) {
		if (plotArea < 30 || plotArea > 60) {
			setPlotArea(35);
		} else {
			super.setPlotArea(plotArea);
		}
	}
}


