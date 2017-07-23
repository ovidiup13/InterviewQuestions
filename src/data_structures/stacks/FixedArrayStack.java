package data_structures.stacks;

public class FixedArrayStack implements StackCollection {

    private static final int DEFAULT_SIZE = 16;

    private int[] elements;
    private int count;

    public FixedArrayStack() {
        elements = new int[DEFAULT_SIZE];
    }

    public FixedArrayStack(int size) {
        elements = new int[size];
    }

    @Override
    public void push(int element) throws StackFullException {
        if (count == elements.length) {
            throw new StackFullException();
        }

        elements[count++] = element;
    }

    @Override
    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }

        return elements[count--];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int peek() throws StackEmptyException {
        if (count == 0) {
            throw new StackEmptyException();
        }

        return elements[count];
    }
}
