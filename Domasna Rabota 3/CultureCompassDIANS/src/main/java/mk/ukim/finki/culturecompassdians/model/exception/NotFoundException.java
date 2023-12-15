package mk.ukim.finki.culturecompassdians.model.exception;

public class NotFoundException extends RuntimeException{
    private String message;

    public NotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public String getErrorMessage() {
        return message;
    }}
