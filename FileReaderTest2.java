package ACTIVITIES;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderTest2 {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new FileReader("Names.txt"));
            String name;
            int age;
            int counter = 1;
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(" ");
                name = line[0];
                // added validation for age input
                if(line.length<2) {
                    System.out.println("Age not found for " + name);
                    continue;
                }
                if(!line[1].matches("[0-9]+")) {
                    System.out.println("Invalid age for " + name);
                    continue;
                }
                age = Integer.parseInt(line[1]);
                System.out.println("\n-----Student #" + counter + "------");
                System.out.println("First Name: " + name);
                System.out.println("Age: " + age);

                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
