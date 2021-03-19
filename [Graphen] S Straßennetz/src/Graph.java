import java.util.LinkedList;

public class Graph {

	private LinkedList<Crossroad> crossroads;
	private int globalId;

	public Graph() {
		crossroads = new LinkedList<Crossroad>();
		globalId = 1;
	}

	// Beginn des zu Bearbeitenden Bereichs:

	//Aufgabe 1
	public void addCrossroad() {
		Crossroad crossroad = new Crossroad(globalId++);
		crossroads.add(crossroad);
	}

	//Aufgabe 2
	public Crossroad findCrossroad(int id) {
		for (Crossroad crossroad : crossroads) {
			if (crossroad.getId() == id) {
				return crossroad;
			}
		}
		return null;
	}

	//Aufgabe 3
	public void addOneWayStreet(int startCrossroadId, int targetCrossroadId, int distance) {
		Crossroad startCrossroad = this.findCrossroad(startCrossroadId);
		Crossroad targetCrossroad = this.findCrossroad(targetCrossroadId);
		if (startCrossroad != null && targetCrossroad != null) {
			OneWayStreet oneWayStreet = new OneWayStreet(targetCrossroad, distance);
			startCrossroad.getOneWayStreets().add(oneWayStreet);
		}
	}

	//Aufgabe 4
	public int findOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		Crossroad startCrossroad = this.findCrossroad(startCrossroadId);
		if (startCrossroad != null) {
			LinkedList<OneWayStreet> oneWayStreets = startCrossroad.getOneWayStreets();
			for (OneWayStreet oneWayStreet : oneWayStreets) {
				if (oneWayStreet.getTarget().getId() == targetCrossroadId) {
					return oneWayStreet.getDistance();
				}
			}
		}
		return -1;
	}

	//Aufgabe 5
	public void removeOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		Crossroad startCrossroad = this.findCrossroad(startCrossroadId);
		if (startCrossroad != null) {
			LinkedList<OneWayStreet> oneWayStreets = startCrossroad.getOneWayStreets();
			oneWayStreets.removeIf(oneWayStreet -> oneWayStreet.getTarget().getId() == targetCrossroadId);
		}
	}

	//Aufgabe 6
	public void removeCrossroad(int id) {
		Crossroad crossroad = this.findCrossroad(id);
		LinkedList<OneWayStreet> oneWayStreets = crossroad.getOneWayStreets();
		for (OneWayStreet oneWayStreet : oneWayStreets) {
			oneWayStreets.remove(oneWayStreet);
		}
		for (Crossroad cross : crossroads) {
			cross.getOneWayStreets().removeIf(oneWayStreet -> oneWayStreet.getTarget().getId() == id);
		}
		crossroads.remove(crossroad);
	}

	//Aufgabe 7
	public int totalDistance() {
		int total = 0;
		for (Crossroad crossroad : crossroads) {
			LinkedList<OneWayStreet> oneWayStreets = crossroad.getOneWayStreets();
			for (OneWayStreet oneWayStreet : oneWayStreets) {
				total += oneWayStreet.getDistance();
			}
		}
		return total;
	}

	
	// Ende des zu Bearbeitenden Bereiches

	public String toString() {
		if (crossroads.isEmpty()) {
			return "Crossroads im Graphen: []  Der Graph ist leer.";
		}
		String result = "Crossroads im Graphen: " + crossroads;
		for (Crossroad crossroad : crossroads) {
			for (OneWayStreet oneWayStreet : crossroad.getOneWayStreets()) {
				result += "\n" + crossroad + " ---> " + oneWayStreet.getTarget() + "   [distance = "
						+ oneWayStreet.getDistance() + "]";
			}
		}
		return result;
	}

}