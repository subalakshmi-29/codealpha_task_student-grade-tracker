import java.util.Scanner;
public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter grade for " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextDouble();
        }

        // Calculate average, highest, and lowest
        double total = 0;
        double highest = studentGrades[0];
        double lowest = studentGrades[0];
        String highestName = studentNames[0];
        String lowestName = studentNames[0];

        for (int i = 0; i < numStudents; i++) {
            total += studentGrades[i];

            if (studentGrades[i] > highest) {
                highest = studentGrades[i];
                highestName = studentNames[i];
            }

            if (studentGrades[i] < lowest) {
                lowest = studentGrades[i];
                lowestName = studentNames[i];
            }
        }

        double average = total / numStudents;

        // Display results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.printf("Highest Grade: %.2f (%s)\n", highest, highestName);
        System.out.printf("Lowest Grade: %.2f (%s)\n", lowest, lowestName);
    }
}
