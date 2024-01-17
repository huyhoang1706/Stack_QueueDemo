package Queue;

// Descending Priority Queue (lower value higher priority)
public class PriorityQueue implements QueueADT {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            Node next = null;
        }
    }
    private int size = 0;

    private Node front, rear;
    public PriorityQueue() {
        front = rear = null;
    }
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void enqueue(int data) {
        // Time complexity: O(n)
        Node newNode = new Node(data);
        Node currentNode = front;
        if (isEmpty()) {
            front = rear = newNode;
            size++;
            return;
        }
        if (front.data < data) {
            // enqueue before front
            newNode.next = front;
            front = newNode;
        } else {
            // Traverse the list to find a position
            while (currentNode.next != null && currentNode.next.data > data) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public int dequeue() {
        // Time complexity: O(1)
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        int deletedData = front.data;
        if (front.next == null) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
        return deletedData;
    }

    @Override
    public int peek() {
        // Time complexity: O(1)
        if (isEmpty()) throw new RuntimeException("Empty Queue.");
        return front.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        PriorityQueue.Node currentNode = front;
        StringBuilder sb = new StringBuilder();
        while (currentNode != null) {
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return "[" + sb.toString().trim() + "]";
    }
}
