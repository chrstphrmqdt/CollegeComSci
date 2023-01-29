import java.io.*;
import java.util.Scanner;

class FinalProj {
    private static final String FILE_NAME = "data.txt";
    private static final String DELIMITER = ",";

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addData();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void addData() {
        String data;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter data to add: ");
        data = input.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(data + DELIMITER);
            System.out.println("Data added successfully!");
        } catch (IOException e) {
            System.out.println("Error adding data: " + e.getMessage());
        }
    }

    private static void displayData() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(DELIMITER);
                for (String s : data) {
                    System.out.println(count + ". " + s);
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error displaying data: " + e.getMessage());
        }
    }

    private static void editData() {
        String data;
        int index;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter index of data to edit: ");
        index = input.nextInt();

        System.out.print("Enter new data: ");
        data = input.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            StringBuilder sb = new StringBuilder();
            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                if (count == index) {
                    sb.append(data + DELIMITER + "\n");
                } else {
                    sb.append(line + "\n");
                }
                count++;
            }

            try (FileWriter fw = new FileWriter(FILE_NAME)) {
                fw.write(sb.toString());
                System.out.println("Data edited successfully!");
            } catch (IOException e) {
                System.out.println("Error editing data: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error editing data: " + e.getMessage());
        }
    }

    private static void deleteData() {
        int index;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter index of data to delete: ");
        index = input.nextInt();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            StringBuilder sb = new StringBuilder();
            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                if (count != index) {
                    sb.append(line + "\n");
                }
                count++;
            }

            try (FileWriter fw = new FileWriter(FILE_NAME)) {
                fw.write(sb.toString());
                System.out.println("Data deleted successfully!");
            } catch (IOException e) {
                System.out.println("Error deleting data: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error deleting data: " + e.getMessage());
        }
    }

    private static void exit() {
        System.out.println("Exiting program...");
        System.exit(0);
    }
}



