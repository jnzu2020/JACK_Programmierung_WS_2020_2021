//--------------------- Aufgabe 8 ---------------------
public class PKW extends Car implements PassengerTransportable
{

    @Override
    public int getNumberOfSeats() {
        return 5;
    }

    @Override
    public int getNumberOfOccupants() {
        return 3;
    }
}