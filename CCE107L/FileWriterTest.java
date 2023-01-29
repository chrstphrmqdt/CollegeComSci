package ACTIVITIES;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        String name;
        int age;
        System.out.print("Enter your Name: ");
        name = console.nextLine();
        System.out.print("Enter Age: ");

        // added validation for age input
        while (!console.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid age: ");
            console.next();
        }
        age = console.nextInt();

        try {
            FileWriter writer = new FileWriter("Names.txt", true);
            writer.write(name + " " + age + " " + "\n");
            writer.close();
            System.out.println("You successfully added a Record!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            console.close();
        }
    }
}
