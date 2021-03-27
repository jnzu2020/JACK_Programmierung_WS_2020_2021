//--------------------- Aufgabe 1 ---------------------
public class Dog extends Animal
{

    @Override
    public void eat(Food food) {
        if ("Dogfood".equals(food.getTyp())) {
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