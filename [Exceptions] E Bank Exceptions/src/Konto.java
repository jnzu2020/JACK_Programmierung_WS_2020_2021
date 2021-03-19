public class Konto {
    private double kontostand;

    public Konto(double stand) {
        this.kontostand = stand;
    }

    public double getStand() {return kontostand;}
    public void setStand(double betrag) {kontostand = betrag;}

    public void einzahlen(double betrag) throws TransaktionException {
        //Aufgabe 2
        if (betrag <= 0) {
            throw new TransaktionException("Ungueltiger Betrag");
        } else {
            kontostand += betrag;
        }
    }

    public void auszahlen(double betrag) throws TransaktionException,KontostandException {
        //Aufgabe 2
        if (betrag <= 0) {
            throw new TransaktionException("Ungueltiger Betrag");
        } else if (kontostand - betrag < 0) {
            throw new KontostandException("Unzureichender Kontostand");
        } else {
            kontostand -= betrag;
        }
    }
}