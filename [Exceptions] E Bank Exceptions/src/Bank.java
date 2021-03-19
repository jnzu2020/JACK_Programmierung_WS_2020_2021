public class Bank {
    private String lastError;

    public String getLastError() {
        return lastError;
    }

    public void transfer(Konto k1, Konto k2, double betrag) {
        //Aufgabe 3
        try {
            k1.auszahlen(betrag);
            k2.einzahlen(betrag);
        } catch (Exception e) {
            lastError = e.getMessage();
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        // Aufgabe 1
        TransaktionException t = new TransaktionException("Das ist der Fehlertext der TransaktionException.");
        KontostandException k = new KontostandException("Das ist der Fehlertext der KontostandException.");
        System.out.println(k.getMessage() + "\n" + t.getMessage() + "\nDas ist der Fehlercode: " + k.getErrorCode());

        // Aufgabe 2
        Konto konto1 = new Konto(200.0);
        Konto konto2 = new Konto(150.0);

        try {
            konto1.einzahlen(50.0);
            System.out.println("Der Kontostand von konto1 betraegt " + konto1.getStand() + ". Er sollte 250.0 betragen.");
        } catch (TransaktionException e) {
            System.out.println("Hier sollte keine Exception auftreten! Fehler: " + e.getMessage());
        }

        try {
            konto1.einzahlen(-50.0);
            System.out.println("Hier haette eine TransaktionException auftreten sollen!");
        } catch (TransaktionException e) {
            System.out.println("TransaktionException korrekt aufgetreten. Fehler: " + e.getMessage());
        }
        finally {
            System.out.println("Der Kontostand von konto1 betraegt " + konto1.getStand() + ". Er sollte 250.0 betragen.");
        }

        try {
            konto2.auszahlen(-20.0);
            System.out.println("Hier haette eine TransaktionException auftreten sollen!");
        } catch (TransaktionException e) {
            System.out.println("TransaktionException korrekt aufgetreten. Fehler: " + e.getMessage());
        }
        catch(KontostandException e) {
            System.out.println("Hier sollte keine KontostandException auftreten!");
        }
        finally {
            System.out.println("Der Kontostand von konto2 betraegt " + konto2.getStand() + ". Er sollte 150.0 betragen.");
        }

        try {
            konto2.setStand(150.00);
            konto2.auszahlen(200.0);
            System.out.println("Hier haette eine KontostandException auftreten sollen!");
        }
        catch(TransaktionException e) {
            System.out.println("Hier sollte keine TransaktionException auftreten!");
        }
        catch(KontostandException e) {
            System.out.println("KontostandException korrekt aufgetreten. Fehler: " + e.getMessage());
        }

        //Aufgabe 3
        konto1.setStand(250);
        konto2.setStand(150);
        b.transfer(konto1, konto2, 200);
        System.out.println("Der Kontostand von konto1 betraegt " + konto1.getStand() + ". Er sollte 50.0 betragen." +
        "\nDer Kontostand von konto2 betraegt " + konto2.getStand() + ". Er sollte 350.0 betragen.");

        konto1.setStand(25);
        konto2.setStand(100);
        b.transfer(konto1, konto2, 100);
        System.out.println("Der Kontostand von konto1 betraegt " + konto1.getStand() + ". Er sollte 25.0 betragen." +
        "\nDer Kontostand von konto2 betraegt " + konto2.getStand() + ". Er sollte 100.0 betragen.");
        System.out.println("Die Variable lastError hat den Wert '" + b.getLastError() + "'. Sie sollte den Wert 'Unzureichender Kontostand' haben.");
    }
}