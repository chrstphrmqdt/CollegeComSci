import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class W2A2Maquidato2 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choices = input.nextInt();
            switch (choices) {
                case 1:
                    addNewRecord(input);
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("**************************************************");
        System.out.println("University of Mindanao Vaccination Records System");
        System.out.println("[1] Add New Vaccinated Record");
        System.out.println("[2] View List of Vaccinated Employees");
        System.out.println("[3] Exit");
        System.out.print("Enter your choice: ");
    }
// file writer
    private static void addNewRecord(Scanner input) throws IOException {
        System.out.print("Enter Employee Name: ");
        String name = input.next();
        System.out.print("Enter Vaccine Received: ");
        String vaccine = input.next();
        try (FileWriter writer = new FileWriter("vaccineMaquidato.txt", true)) {
            writer.write(String.join(" ", name, vaccine) + "\n");
            System.out.println("Record added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
// file reader
    private static void viewRecords() {
        try (Scanner reader = new Scanner(new FileReader("vaccineMaquidato.txt"))) {
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(" ");
                String name = line[0];
                String vaccine = line[1];
                System.out.println("Name: " + name + " | Vaccine Received: " + vaccine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}