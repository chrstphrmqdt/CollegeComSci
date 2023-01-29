import java.util.Scanner;

public class W2A1Maquidato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize 2D array to store grades
        double[][] grades = new double[4][];

        try {
            // Get grades for each year level
            for (int i = 0; i < grades.length; i++) {
                System.out.println("Enter grades for Year " + (i + 1) + " (separated by a space): ");
                String[] inputGrades = sc.nextLine().split(" ");
                grades[i] = new double[inputGrades.length];

                // Convert string grades to double and store in 2D array
                for (int j = 0; j < inputGrades.length; j++) {
                    grades[i][j] = Double.parseDouble(inputGrades[j]);
                }
            }

            // Print summary of grades
            printGradesSummary(grades);

            // Identify highest grade for each year level
            for (int i = 0; i < grades.length; i++) {
                double highestGrade = getHighestGrade(grades[i]);
                System.out.println("Highest grade in Year " + (i + 1) + ": " + highestGrade);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric grades.");
        }
    }

    // Method to print summary of grades
    public static void printGradesSummary(double[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Year " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to get highest grade in a given array
    public static double getHighestGrade(double[] grades) {
        double highestGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
        }
        return highestGrade;
    }
}
