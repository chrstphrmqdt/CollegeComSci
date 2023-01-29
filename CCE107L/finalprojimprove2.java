import java.io.*;
import java.util.Scanner;

class finalprojimprove {
    private String data;

    public finalprojimprove(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class DataManager {
    private static final String FILE_NAME = "data.txt";

    public void addData(finalprojimprove finalprojimprove) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true));
            writer.println(finalprojimprove.getData());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayData() {
        try {
            Scanner scanner = new Scanner(new File(FILE_NAME));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void editData(int lineNumber, String newData) {
        try {
            File file = new File(FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder fileContent = new StringBuilder();
            int currentLineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLineNumber == lineNumber) {
                    line = newData;
                }
                fileContent.append(line);
                fileContent.append(System.lineSeparator());
                currentLineNumber++;
            }
            reader.close();
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteData(int lineNumber) {
        try {
            File file = new File(FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder fileContent = new StringBuilder();
            int currentLineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLineNumber != lineNumber) {
                    fileContent.append(line);
                    fileContent.append(System.lineSeparator());
                }
                currentLineNumber++;
            }
            reader.close();
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllData(){
        try {
            PrintWriter writer = new PrintWriter(FILE_NAME);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class finalprojimprove2 {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Delete All Data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                scanner.nextLine();
                System.out.print("Enter data: ");
                String data = scanner.nextLine();
                dataManager.addData(new finalprojimprove(data));
            } else if (choice == 2) {
                dataManager.displayData();
            } else if (choice == 3) {
                System.out.print("Enter line number to edit: ");
                int lineNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new data: ");
                String newData = scanner.nextLine();
                dataManager.editData(lineNumber, newData);
            } else if (choice == 4) {
                System.out.print("Enter line number to delete: ");
                int lineNumber = scanner.nextInt();
                dataManager.deleteData(lineNumber);
            } else if (choice == 5) {
                dataManager.deleteAllData();
            } else {
                break;
            }
        }
        scanner.close();
    }
}
