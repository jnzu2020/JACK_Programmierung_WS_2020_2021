public class KontostandException extends Exception {
    private final int errorCode = 1;

    public KontostandException(String error) {
        //Aufgabe 1
        super(error);
    }

    public int getErrorCode() {
        return 1;
    }
}