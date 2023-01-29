
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
public class kim {

    public static void main(String[] args) throws IOException  {
        // TODO Auto-generated method stub
        Scanner console = new Scanner(System.in);

        char[] array = new char[100];
        int menu = 0;
        String name;
        String vacname;
        int age,counter =1;
        System.out.println("1] Create Record 2] View Record");
        menu = console.nextInt();

        switch(menu) {

            case 1:
                System.out.println("Enter Your Name: ");
                name = console.next();
                name = console.nextLine();

                System.out.println("Enter Your Vaccine Name: ");
                vacname = console.next();

                System.out.println("Enter Your Age: ");
                age = console.nextInt();


                FileWriter writer = new FileWriter("store.txt",true);
                writer.write(array);
                writer.write("Name: "+name+"\n");
                writer.write("Vaccine Name: "+vacname+"\n");
                writer.write("Age:"+age+"\n");
                writer.close();

                System.out.println("You Are Successfully Recorded!");

                break;

            case 2:
                FileReader reader = new FileReader("store.txt");

                reader.read(array);
                System.out.println("Data Recorded: ");
                System.out.println(array);

                reader.close();

                break;

        }

    }
}