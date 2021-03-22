//--------------------- Aufgabe 7 ---------------------
public class PassengerPlane extends Airplane implements PassengerTransportable
{

    @Override
    public int getNumberOfSeats() {
        return 100;
    }

    @Override
    public int getNumberOfOccupants() {
        return 50;
    }
}