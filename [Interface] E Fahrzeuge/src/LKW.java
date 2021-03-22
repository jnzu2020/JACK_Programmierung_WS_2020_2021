//--------------------- Aufgabe 6 ---------------------
public class LKW extends Car implements Loadable
{

    @Override
    public String getLoadTyp() {
        return "LoadTyp";
    }

    @Override
    public int getCapacity() {
        return 10;
    }

    @Override
    public int getLoad() {
        return 5;
    }
}