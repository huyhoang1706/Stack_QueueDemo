package Queue;

public class QueueUsingArray implements QueueADT {
    private int front, rear;
    private int capacity;
    private int[] arr;

    public QueueUsingArray(int capacity) {
        front = rear = -1;
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
        return size() == 0;
    }

    @Override
    public void enqueue(int data) {
        if (isFull()) throw new RuntimeException("Queue is full");
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = data;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int dequeueElement = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            for (int i = front; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }
        return dequeueElement;
    }

    @Override
    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    @Override
    public int size() {
        return rear+1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty Queue";
        StringBuilder sb = new StringBuilder();
        for (int i = front; i <= rear; i++) {
            sb.append(arr[i]).append(" ");
        }
        return "[" + sb.toString().trim() + "]" ;
    }
}
