package ACTIVITIES;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class W2P1_MAQUIDATO {

	public static void main(String[] args) throws IOException
	{
		Scanner console = new Scanner (System.in);
		
		String name;
		int age;
		System.out.print("Enter your Name: ");
		name = console.next();
		System.out.print("Enter Age: ");
		age = console.nextInt();
		
		FileWriter writer = new FileWriter("name2.txt", true);
		writer.write(name + " " + age + " " + "\n");
		writer.close();
		
		System.out.println("You successfully added a Record!");
	
	}
}