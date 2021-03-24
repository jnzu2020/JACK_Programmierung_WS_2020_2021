
public class MeanPerson {

	private Car			favouriteCar;	// Lieblingsauto der Person
	private Car			ownedCar;		// Eigenes Auto der Person
	private MeanPerson	friend;			// "Freund" der Person
	private int			money; 			// Kontostand der Person in Euro
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	

	// Aufgabe 1
	public MeanPerson() {
		this.money = 10000;
	}

	// Aufgabe 2
	public String ownedCar() {
		return this.ownedCar.getManufacturer() + " " + this.ownedCar.getModel();
	}

	// Aufgabe 3
	public String favouriteCar() {
		return this.favouriteCar.getManufacturer() + " " + this.favouriteCar.getModel();
	}

	// Aufgabe 4
	public String friendsCar() {
		Car friendOwnedCar = friend.getOwnedCar();
		return friendOwnedCar.getManufacturer() + " " + friendOwnedCar.getModel();
	}

	// Aufgabe 5
	public boolean isHappy() {
		return this.favouriteCar.getModel().equals(this.ownedCar.getModel()) &&
				this.favouriteCar.getManufacturer().equals(this.ownedCar.getManufacturer()) &&
				!this.ownedCar.isDamaged();
	}

	// Aufgabe 6
	public boolean isEnvious() {
		if (isHappy()) {
			return false;
		} else {
			Car friendOwnedCar = friend.getOwnedCar();
			if (friendOwnedCar.getValue() > this.ownedCar.getValue()) {
				return true;
			} else {
				return false;
			}
		}
	}

	// Aufgabe 7
	public void repairCar() {
		this.money -= this.ownedCar.getRepairCost();
	}

	// Aufgabe 8
	public void buyNewCar(Car newCar) {
		int allMoney = money;
		if (ownedCar != null) {
			allMoney += ownedCar.getValue();
		}
		if (newCar.getValue() <= allMoney) {
			if (ownedCar != null) {
				money -= (newCar.getValue() - ownedCar.getValue());
			} else {
				money -= newCar.getValue();
			}
			ownedCar = newCar;
		}
	}

	
	//=================================
	// Ende des zu bearbeitenden Codes
	//=================================
	
	// Getter und Setter fuer die Klasse Person.
	// Die Getter und Setter sind bereits vollstaendig implementiert
	// und sollen fuer die Aufgabe NICHT veraendert werden!	
	public void setFavouriteCar(Car newFavouriteCar){
		favouriteCar = newFavouriteCar;
	}
	
	public Car getFavouriteCar(){
		return favouriteCar;
	}
	
	public void setOwnedCar(Car newOwnedCar){
		ownedCar = newOwnedCar;
	}
	
	public Car getOwnedCar(){
		return ownedCar;
	}
	
	public void setFriend(MeanPerson newFriend){
		friend = newFriend;
	}
	
	public MeanPerson getFriend(){
		return friend;
	}
	
	public void setMoney(int newMoney){
		money = newMoney;
	}
	
	public int getMoney(){
		return money;
	}
		
	// Testen Sie hier ob ihre Methoden wie gewuenscht funktionieren!	
	public static void main(String[] args) {
		MeanPerson	person	= new MeanPerson();
		MeanPerson	friend	= new MeanPerson();
		Car			car1	= new Car();
		Car			car2	= new Car();
	}

}
