import java.util.Scanner;

public class QueueArray {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " removed");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    static void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + queue[front]);
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.println(queue[i]);

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    enqueue(input.nextInt());
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 0:
                    System.out.println("Program ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        input.close();
    }
}