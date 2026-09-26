import java.util.Scanner;

public class IT26101326Lab9Q4 {

    // a) calculate final mark: 30% assignment + 70% exam
    static double calcFinalMark(double assignment, double exam) {
        return (0.3 * assignment) + (0.7 * exam);
    }

    // b) find grade based on final mark
    static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) print details of a student
    static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %-10c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // d) get input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println();
        System.out.printf("%-15s %-15s %-10s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        sc.close();
    }
}