import java.util.Arrays;

public class Workshop {
	
	public int money;
	public Car[] cars;
	public int repairedCarsPerDay;
	private int count;
	public int[] repairCosts;
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public Workshop(int capacity, int speed){
		this.cars = new Car[capacity];
		this.repairCosts = new int[capacity];
		this.repairedCarsPerDay = speed;
		this.money = 1000;
	}

	
	// Aufgabe 2
	public boolean acceptCar(Car car){
		if (count < this.cars.length && car.isDamaged()) {
			cars[count++] = car;
			return true;
		}
		return false;
	}
	
			
	// Aufgabe 3
	public void nextDay(){
		int alreadyRepaired = 0;
		for (int i = 0 ; i < cars.length ; i++) {
			if (alreadyRepaired < this.repairedCarsPerDay && cars[i] != null && cars[i].isDamaged()) {
				repairCosts[i] = cars[i].repair();
				alreadyRepaired++;
			}
		}
	}
	
	
	// Aufgabe 4
	public int retrieveCar(Car car){
		for (int i = 0 ; i < cars.length ; i++) {
			if (cars[i] != null &&
					cars[i].getManufacturer().equals(car.getManufacturer()) &&
					cars[i].getModel().equals(car.getModel()) &&
					!cars[i].isDamaged()) {
				int repairCost = repairCosts[i];
				this.money += repairCost / 5;
				for (int j = i ; j < cars.length - 1 ; j++) {
					cars[j] = cars[j + 1];
					repairCosts[j] = repairCosts[j + 1];
				}
				count--;
				return repairCost;
			}
		}
		return 0;
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
		
	public int getMoney(){
		return money;
	}
		
	public static void main(String[] args) {
		// Hier kommt ihr Testcode hin
	}
}
