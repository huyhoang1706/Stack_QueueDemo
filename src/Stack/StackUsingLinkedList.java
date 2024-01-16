package Stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList implements StackADT{
    private class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            next = null;
        }
    }
    private Node top;
    private int size = 0;
    public StackUsingLinkedList() { top = null; }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = null;
        } else {
            newNode.next = top;
        }
        top = newNode;
        size++;
    }

    @Override
    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        Node temp = top;
        int popElement = temp.data;
        top = temp.next;
        temp = null;
        size--;
        return popElement;
    }

    @Override
    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty Stack";
        Node currentNode = top;
        StringBuilder sb = new StringBuilder();
        while (currentNode != null) {
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return "[" + sb.toString().trim() + "]";
    }
}
