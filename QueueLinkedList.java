import java.util.Scanner;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " removed");
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + front.data);
        }
    }

    static void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
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