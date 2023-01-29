package CCE109L;
import java.util.Scanner;
import java.util.LinkedList;
public class LABACTDECEMBER {
	  
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Scanner linkedlist = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        String input;
        int input1, intro;
        
        
        System.out.println("*********JAVA*********");
         System.out.print("\nENTER 1 TO PROCEED:");
         intro = scan.nextInt();
         System.out.println();
         System.out.println("[1]: CALCULATION");
         System.out.println("[2]: LOOP");
         System.out.println("[3]: ARRAY");
         
         
         boolean run = true;
         do {
             System.out.println("\nEnter your menu choice:" );
             input = linkedlist.next();
             
             
             switch (input) {
             
             // add
             case "1":
            Scanner triangle = new Scanner(System.in);
             System.out.println("\nFOR 1");
             System.out.println("Enter the base width of the Triangle:");
              double base = triangle.nextDouble();

              System.out.println("Enter the height of the Triangle:");
              double height = triangle.nextDouble();

              //Area = (width*height)/2
              double area = (base* height)/2;
              System.out.println("Area of Triangle is: " + area);
              System.out.println("Thank you for using!");    
             break;
             
             
             case "2":    
                 int i, j, n;  

                 Scanner in = new Scanner(System.in);  
                 System.out.println("\nFOR 2");      
                 System.out.print("Enter value of star: ");  

                 n = in.nextInt();        

                 for (i= n-1; i>=0 ; i--)  
                 {
                 for (j=0; j<=i; j++)  
                	 if(i%2==0)
                 {
                System.out.print("*" + " ");
                 }
                 System.out.println();  
                 }

             break; 
         
             case "3":    
            	System.out.println("FOR 3");
     			System.out.println("Enter Number of Values: ");
                 input1 = linkedlist.nextInt();
                int[] value = new int[input1];
     			int looper = 0;
     			int k = looper + 1;
     			int d = 0;
     			do {
     				System.out.print("Enter Value " + k + ": ") ;
     				value[looper] = linkedlist.nextInt();
     				++k;
     				++looper;
     				d += value[looper-1];
     				} while (looper < k);
     				System.out.print("\n[");
     				for(int index = 0; index < input1; index++) {
     				if (index != value.length-1) {
     				System.out.print(value[index] + ", ");
     				} else {
     				System.out.print(value[index]);
     				
     			
     				System.out.println("]");
     			}
             break;
             
             }
	}

             
         } while (run);
    }
}