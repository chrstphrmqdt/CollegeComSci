
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

    public class W2A2Maquidato {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            while (true) {
                System.out.println("**************************************************");
                System.out.println("University of Mindanao Vaccination Records System");
                System.out.println("[1] Add New Vaccinated Record");
                System.out.println("[2] View List of Vaccinated Employees");
                System.out.println("[3] Exit");
                System.out.print("Enter your choice: ");

                int choice = console.nextInt();
                if (choice == 1) {
                    addNewRecord(console);
                } else if (choice == 2) {
                    viewRecords();
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
            console.close();
        }

        public static void addNewRecord(Scanner console)  {
            System.out.print("Enter Employee Name: ");
            String name = console.next();
            System.out.print("Enter Vaccine Received: ");
            String vaccine = console.next();
            try {
                FileWriter writer = new FileWriter("vaccination_records.txt", true);
                writer.write(name + " " + vaccine + "\n");
                writer.close();
                System.out.println("Record added successfully!");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

        public static void viewRecords() {
            try {
                Scanner reader = new Scanner(new FileReader("vaccination_records.txt"));
                while (reader.hasNextLine()) {
                    String[] line = reader.nextLine().split(" ");
                    String name = line[0];
                    String vaccine = line[1];
                    System.out.println("Name: " + name + " | Vaccine Received: " + vaccine);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

        }
    }

