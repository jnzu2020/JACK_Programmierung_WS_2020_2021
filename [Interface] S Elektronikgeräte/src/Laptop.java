//--------------------- Aufgabe 3 ---------------------
public class Laptop extends Computer implements Battery, Display
{
	//Variable, die den Batteriestand symbolisiert.
	//Verwende sie im Zusammenhang mit den Methoden aus Battery.
	private int battery = 0;

	@Override
	public int restBattery() {
		return battery;
	}

	@Override
	public void charge() {
		battery += 5;
	}

	@Override
	public int multiply(int number1, int number2) {
		if (battery < 5) {
			return 0;
		} else {
			battery -= 5;
			return number1 * number2;
		}
	}

	@Override
	public int divide(int number1, int number2) {
		if (battery < 10) {
			return 0;
		} else {
			battery -= 10;
			return number1 / number2;
		}
	}

	@Override
	public int add(int number1, int number2) {
		if (battery < 2) {
			return 0;
		} else {
			battery -= 2;
			return number1 + number2;
		}
	}

	@Override
	public int subtract(int number1, int number2) {
		if (battery < 3) {
			return 0;
		} else {
			battery -= 3;
			return number1 - number2;
		}
	}

	@Override
	public String showThis(String string) {
		return string;
	}

	@Override
	public String showThat() {
		return "Dies ist ein Laptop";
	}
}