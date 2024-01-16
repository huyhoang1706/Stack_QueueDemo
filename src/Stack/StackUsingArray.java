package Stack;

import java.util.EmptyStackException;

public class StackUsingArray implements StackADT {
    private int top = -1;
    private int capacity = 0;
    private int[] arr;

    public StackUsingArray() {
        this(10);
    }

    public StackUsingArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Size can not be negative");
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public boolean isFull() {
        return top == capacity-1;
    }
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void push(int data) {
        if (isFull()) throw new StackOverflowError();
        top++;
        arr[top] = data;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int popElement = arr[top];
        top--;
        return popElement;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int peekElement = arr[top];
        return peekElement;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty Stack";
        StringBuilder sb = new StringBuilder();
        for (int i = top; i>=0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return "[" + sb.toString().trim() + "]";
    }
}
