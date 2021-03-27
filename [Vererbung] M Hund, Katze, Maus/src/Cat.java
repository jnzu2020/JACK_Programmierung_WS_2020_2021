//--------------------- Aufgabe 3 ---------------------
public class Cat extends Animal
{
	public void eat(Mouse mouse)
	{
		if (hunger > mouse.getWeight() / 2) {
			hunger -= mouse.getWeight() / 2;
		} else {
			hunger = 0;
		}
	}

	@Override
	public void eat(Food food) {
		if ("Catfood".equals(food.getTyp())) {
			if (hunger > food.getVolume()) {
				hunger -= food.getVolume();
				food.setVolume(0);
			} else {
				food.setVolume(food.getVolume() - hunger);
				hunger = 0;
			}
		}
	}
}