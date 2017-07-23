package data_structures.stacks;

public class StackEmptyException extends Exception {

    public StackEmptyException() {
        super();
    }

    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
