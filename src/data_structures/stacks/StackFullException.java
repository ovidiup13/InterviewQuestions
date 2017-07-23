package data_structures.stacks;

public class StackFullException extends Exception {

    public StackFullException() {
        super();
    }

    public StackFullException(String message) {
        super(message);
    }

    public StackFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
