package ACTIVITIES;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class W2P2_MAQUIDATO {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new FileReader("name2.txt"));
			String name;
			int age;
			int counter = 1;
			while(reader.hasNext()) 
			{
				name = reader.next();
				age = reader.nextInt();
				
				System.out.println("\n-----Student #" + counter +"------");
				System.out.println("First Name: " + name);
				System.out.println("Age: " + age);
				
				counter++;
				
						
			}
	}
}