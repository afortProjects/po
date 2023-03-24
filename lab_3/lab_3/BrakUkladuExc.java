package lab_3;

public class BrakUkladuExc extends Exception{
    public BrakUkladuExc() {
        super();
    }
    public BrakUkladuExc(String message) {
        super(message);
    }

    public BrakUkladuExc(Throwable cause) {
        super(cause);
    }
    
    public BrakUkladuExc(String message, Throwable cause) {
        super(message, cause);
    }
}
