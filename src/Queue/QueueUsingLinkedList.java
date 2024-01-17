package Queue;

public class QueueUsingLinkedList implements QueueADT {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    private Node front, rear;
    private int size = 0;

    public QueueUsingLinkedList() { front = rear = null; }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        Node deletedNode = front;
        int deletedData = deletedNode.data;
        if (front.next == null) {
            front = rear = null;
        } else {
            front = deletedNode.next;
        }
        deletedNode = null;
        size--;
        return deletedData;
    }

    @Override
    public int peek() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return front.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node currentNode = front;
        StringBuilder sb = new StringBuilder();
        while (currentNode != null) {
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return "[" + sb.toString().trim() + "]";
    }
}
