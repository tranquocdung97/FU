import java.util.Scanner;

class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        size = capacity + 1;
        queue = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            queue[rear] = element;
            rear = (rear + 1) % size;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int element = queue[front];
            front = (front + 1) % size;
            return element;
        }
        return -1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void transform(int k) {
        for (int i = 0; i < k; i++) {
            int frontElement = dequeue();
            enqueue(frontElement);
        }
    }

    public void printQueue() {
        int current = front;
        while (current != rear) {
            System.out.print(queue[current] + " ");
            current = (current + 1) % size;
        }
    }
}

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        CircularQueue circularQueue = new CircularQueue(n);

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            circularQueue.enqueue(element);
        }

        int k = scanner.nextInt();
        scanner.close();

        circularQueue.transform(k);
        circularQueue.printQueue();
    }
}
