import java.util.Arrays;

//Aufgabe 2
public class Keyboard implements Input, Memory {

	private int batteryCharge;
	private Character[] storage;

	public Keyboard() {
		storage = new Character[10];
		batteryCharge = 100;
	}

	// Zu bearbeitender Bereich: (Aufgaben 3-7)
	@Override
	public boolean needsToCharge() {
		return batteryCharge <= 10;
	}

	@Override
	public void charge() {
		if (batteryCharge + 20 <= 100) {
			batteryCharge += 20;
		} else {
			batteryCharge = 100;
		}
	}

	@Override
	public void getInput(char input) {
		if (!needsToCharge()) {
			if (storage.length - 1 >= 0) System.arraycopy(storage, 0, storage, 1, storage.length - 1);
			storage[0] = input;
			batteryCharge -= 5;
		}
	}

	@Override
	public Character getFirstChar() {
		if (!needsToCharge()) {
			batteryCharge -= 4;
			if (storage[0] != null) {
				Character firstChar = storage[0];
				int index = 0;
				while (storage[index] != null && index < storage.length - 1) {
					storage[index] = storage[index + 1];
					index++;
				}
				storage[index] = null;
				return firstChar;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public void emptyMemory() {
		if (!needsToCharge()) {
			Arrays.fill(storage, null);
		}
		batteryCharge -= 2;
	}
	//Ende des zu bearbeitenden Bereiches
}