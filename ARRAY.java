package CCE109L;
import java.util.Scanner;

public class ARRAY {

	public static void main(String[] args) {
		Scanner crit = new Scanner (System.in);
		
		System.out.println("******* SWITCH AND IF STATEMENT *******");
		
		char a;
		System.out.println("Do you want to proceed? Y/N?");
		a = crit.next().charAt(0);
		
		switch(a) {
		
		case 'y', 'Y':
		int x;
		System.out.println("Enter the grades you want to keep: ");
		x = crit.nextInt();
		
		int[] array = new int[x];
		System.out.println("Enter Grades: ");
		for(int y= 0; y < x; y++) {
			array[y] = crit.nextInt();
		}
		
		System.out.println("-------------------------------");
		
		if(array[0] >=90) {
			System.out.println(array[0] + "IS PASS");
		} else {
			System.out.println(array[0] + " IS FAIL");
		}
		if(array[1] >=75) {
			System.out.println(array[1] + " IS PASS");
		} else {
			System.out.println(array[1] + " IS FAIL");
		}
		if(array[2] >=75) {
			System.out.println(array[2] + " IS PASS");
		} else {
			System.out.println(array[2] + " IS FAIL");
		}
		
		System.out.println("******* Thank You ! ********");
		break;
		
		case 'n', 'N':
			System.out.println("******* Thank You ! ********");
		
		}
		
}
}