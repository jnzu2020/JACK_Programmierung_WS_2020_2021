//	-------------------- Aufgabe 2 --------------------
// 2 a)
public class Human extends Creature {

	private boolean earlyRiser;
	private String nation;

	public Human(boolean earlyRiser, String nation) {
		this.earlyRiser = earlyRiser;
		this.nation = nation;
	}

	public boolean isEarlyRiser() {
		return earlyRiser;
	}

	public void setEarlyRiser(boolean earlyRiser) {
		this.earlyRiser = earlyRiser;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 2 b) und c)

	@Override
	public Creature reproduce() {
		if (getAge() > 18) {
			if (getAge() % 2 == 0) {
				return new Human(true, nation);
			} else {
				return new Human(false, nation);
			}
		}
		return null;
	}

	@Override
	public double bedTime() {
		double time = 0.0;
		if ("Narnia".equals(nation)) {
			time = 21;
		} else if ("Oz".equals(nation)) {
			time = 19;
		} else if ("Mordor".equals(nation)) {
			time = 24;
		} else {
			time = 18;
		}
		if (!earlyRiser) {
			time++;
			if (time > 24) {
				time = 24;
			}
		}
		return time;
	}
}
