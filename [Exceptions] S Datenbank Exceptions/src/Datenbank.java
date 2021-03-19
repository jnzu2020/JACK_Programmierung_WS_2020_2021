
import java.util.Scanner;
import java.util.HashMap;

public class Datenbank {

    private String userName;
    private String givenPassword;
    private String key;
    private String value;
    
    private static final String passwortError = "Falsches Passwort!";
    private static final String nutzerError = "Der Benutzername darf nur aus Buchstaben und Zahlen bestehen!";
    private static final String keyError = "Der Key darf nur aus Buchstaben und Zahlen bestehen!";
    private static final String valueError = "Der Wert ist keine ganze Zahl!";

    private HashMap<String, Integer> lager;
    private HashMap<String, Integer> kaufhaus;

    private String password = "passwort123";

    public Datenbank(HashMap<String, Integer> lager, HashMap<String, Integer> kaufhaus) {
        this.lager = lager;
        this.kaufhaus = kaufhaus;
    }
    
    public HashMap<String, Integer> getLager() {
    	return lager;
    }
    
    public HashMap<String, Integer> getKaufhaus() {
    	return kaufhaus;
    }

    //Aufgabe 1
    public String nimmInput() {
        Scanner scanner = new Scanner(System.in);
    	return scanner.next();
    }

    //Aufgabe 2
    public void pruefeInput() throws InputError {
        pruefeName();
        pruefePassword();
        pruefeKey();
        pruefeValue();
    }

    public void pruefeName() throws InputError {
        String pattern = "^[A-Za-z0-9]+$";
        if (!userName.matches(pattern)) {
            throw new InputError(nutzerError);
        }
    }

    public void pruefePassword() throws InputError {
        if (!password.equals(givenPassword)) {
            throw new InputError(passwortError);
        }
    }

    public void pruefeKey() throws InputError {
        String pattern = "^[A-Za-z0-9]+$";
        if (!key.matches(pattern)) {
            throw new InputError(keyError);
        }
    }

    public void pruefeValue() throws InputError {
        try {
            Integer.parseInt(value);
        } catch (Exception e) {
            throw new InputError(valueError);
        }
    }

    //Aufgabe 3
    public void ablauf() throws Exception {
        bewegeValue();
    }

    public void bewegeValue() throws Exception {
        int valueInt = Integer.parseInt(value);
        if (valueInt < 0) {
            throw new InputError("Ungueltiger Value!");
        }

        if (!lager.containsKey(key)) {
            throw new InputError("Key wurde im Lager nicht gefunden!");
        }

        int newValueOfLager = lager.get(key) - valueInt;
        if (newValueOfLager < 0) {
            throw new LagerError("Zu niedriger Lagerbestand! " + lager.get(key));
        }

        lager.put(key, newValueOfLager);

        if (kaufhaus.containsKey(key)) {
            kaufhaus.put(key, kaufhaus.get(key) + valueInt);
        } else {
            kaufhaus.put(key, valueInt);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> lagerTest = new HashMap<String, Integer>();
        lagerTest.put("Brot", 10);
        lagerTest.put("Milch", 8);
        HashMap<String, Integer> kaufhausTest = new HashMap<String, Integer>();
        kaufhausTest.put("Milch", 3);

        Datenbank main = new Datenbank(lagerTest, kaufhausTest);

        System.out.println("Bitte geben Sie Benutzername, Passwort, Key, und Value an.");
        main.userName = main.nimmInput();
        main.givenPassword = main.nimmInput();
        main.key = main.nimmInput();
        main.value = main.nimmInput();
        try {
        	main.pruefeInput();
        	main.ablauf();
        }
        catch(Exception e) {
        	System.out.println("Beim Prüfen der Eingaben ist ein Fehler aufgetreten: " + e.getMessage() + "Bitte starten Sie das Programm erneut.");
        }
            
        System.out.println("Im Lager ist so viel Brot vorhanden: " + lagerTest.get("Brot"));
        System.out.println("Im Lager ist so viel Milch vorhanden: " + lagerTest.get("Milch"));
        if(kaufhausTest.containsKey("Brot")) {
            System.out.println("Im Kaufhaus ist so viel Brot vorhanden: " + kaufhausTest.get("Brot"));
        }
        else {
            System.out.println("Im Kaufhaus ist kein Brot vorhanden.");
        }
        System.out.println("Im Kaufhaus ist so viel Milch vorhanden: " + kaufhausTest.get("Milch"));
    }
}
