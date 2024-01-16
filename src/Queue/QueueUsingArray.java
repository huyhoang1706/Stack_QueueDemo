package Queue;

public class QueueUsingArray implements QueueADT {
    private int front, rear;
    private int capacity, size = 0;
    private int[] arr;

    public QueueUsingArray(int capacity) {
        front = rear = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public QueueUsingArray() {
        this(10);
    }

    public boolean isFull() {
        return rear == capacity;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public void enqueue(int data) {
        if (isFull()) throw new RuntimeException("Queue is full");
        arr[rear] = data;
        rear++;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int dequeueElement = arr[front];
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        size--;
        return dequeueElement;
    }

    @Override
    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty Queue";
        StringBuilder sb = new StringBuilder();
        for (int i = front; i < rear; i++) {
            sb.append(arr[i]).append(" ");
        }
        return "[" + sb.toString().trim() + "]" ;
    }
}
