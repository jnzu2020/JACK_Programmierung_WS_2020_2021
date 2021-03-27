//--------------------- Aufgabe 2 ---------------------
public class Mouse extends Animal
{

    @Override
    public void eat(Food food) {
        if ("Cheese".equals(food.getTyp()) || "Peanuts".equals(food.getTyp())) {
            if (hunger > food.getVolume()) {
                hunger -= food.getVolume();
                food.setVolume(0);
            } else {
                food.setVolume(food.getVolume() - hunger);
                hunger = 0;
            }
        }
    }

    @Override
    public void getHungry() {
        hunger += 5;
    }
}