import java.util.Scanner;

public class Scenario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int highest;
        int lowest;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }

        highest = marks[0];
        lowest = marks[0];

        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + (total / 5.0));
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        input.close();
    }
}