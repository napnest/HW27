package exceptions;

public class WrongLoginException extends Throwable {
    public WrongLoginException() {
    }

    public WrongLoginException(String message){
        super(message);
    }
}
