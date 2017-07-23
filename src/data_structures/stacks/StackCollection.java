package data_structures.stacks;

public interface StackCollection {

    void push(int element) throws StackFullException;

    int pop() throws StackEmptyException;

    boolean isEmpty();

    int peek() throws StackEmptyException;
}
