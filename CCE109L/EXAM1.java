package CCE109L;

import java.util.Scanner;

public class EXAM1
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    System.out.print("Do want to proceed? ");
	    String choice = scanner.nextLine();
	    
	    
	    if (choice.equalsIgnoreCase("y")) {
	        System.out.println("\n****** EVALUATING SYSTEM ****");
    		System.out.print("Name: ");
    		String name = scanner.nextLine();
    		System.out.print("ID: ");
    		int id = scanner.nextInt();
    		System.out.print("Code: ");
    		int code = scanner.nextInt();
    		
    		System.out.println("\n ");
    		System.out.print("How many subject do you want to load? ");
    		int load = scanner.nextInt();
    		
    		int[] grades = new int[load];
    		
    // 		insert user input to grades array
    		for (int i = 0; i < load; i++) {
    		   	System.out.print(" ");
    		    int input = scanner.nextInt();
    		    
    		    if (input < 50) {
    		       grades[i] = 0;
    		    } else {
    		          grades[i] = input;
    		    }
    		    
    		
    		  
    
    		}
    		
    		System.out.println("\n ");
     // 		Display Grades Array
    		for (int j = 0; j < grades.length; j++) {
    		    System.out.print(grades[j] + ",");
    		}
    		
    // 		get the Highest and lowestGrade Grade
            int highestGrade = grades[0];
            int lowestGrade = grades[0];
            for (int i = 0; i < grades.length; i++) {
                // highestGrade
                    if (grades[i] > highestGrade) {
                        highestGrade = grades[i];
                    }
                      // lowestGrade
                    if (grades[i] < lowestGrade) {
                        lowestGrade = grades[i];
                    }
            }
    		
    		
    // 		get the total of all grades
            int total = 0;
            for (int a = 0; a < grades.length; a++) {
                total += grades[a];
            }
            
            // get the average of all grades
            int average = total/grades.length;
    		
    		System.out.println("\n ");
    		System.out.println("Subject Grade");
    		System.out.println("Highest is " + highestGrade);
    		System.out.println("Lowest is "+ lowestGrade);
    		System.out.println("Average Grade: " + average);
    		
    		String lastname = name.substring(name.lastIndexOf(" "));
    		
    		System.out.println("\n ");
    		if (average < 75) {
    		  System.out.println(lastname +" is failed the subj!");
    		} else {
    		    System.out.println(lastname +" has passed the subj!");
    		}
    		
    		
    		
    		System.out.println("\n*******************************");
	    }
	    
	
			
	}
}