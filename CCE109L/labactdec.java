package CCE109L;
import java.util.Arrays;
import java.util.Scanner;
public class labactdec {
	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		boolean loop=true;
		int arn=0;
		do{
		System.out.println("**********JAVAISHARD*************");
		System.out.println("Main Menu Selection: ");
		System.out.println("\n[1]Calculation \n[2]Loop \n[3]Array");
		String mu=gg.nextLine();
		int jsh=Integer.parseInt(mu);
		String art="";
		switch(jsh){
		case 1:
		System.out.println();
		System.out.println("[Calculation] \n \nArea of a Triangle \nPlease input your height");
		int c=gg.nextInt();
		System.out.println("Please input your base");
		int t=gg.nextInt();
		double a=c*t/2;
		System.out.printf("%5.1f ",a);
		loop=false;
		break;
		case 2:
		System.out.println("[Loop] \n*Stars* \nEnter Value of Stars");
		int s=gg.nextInt();
		for(int o=s-1;o>=0;o--){
		for(int p=0;p<=o;p++){
		if(o %2==0){
		System.out.print("*");}}
		System.out.println();
		}
		loop=false;
		break;
		case 3:
			System.out.println("[Array]");
			System.out.println("Please input your values now");
			boolean ar=true;
			while(ar){
				if(gg.hasNextInt()) {
					arn = gg.nextInt();
					String arr=String.valueOf(arn);
					art+=" ";
					art+=arr;
		}
				else{ar=false;}
		}
			String[] alt=art.split(" ");
			String[] prox = new String[alt.length-1];
				for (int i = 0;i<=prox.length-1; i++){
				prox[i]=alt[i+1];
		}
			System.out.println(Arrays.toString(prox));
			loop=false;
			break;
		default:
			System.out.println("invalid input try again");
			System.out.println();
		}
		}while(loop);
			System.out.println("Thanks for using");
		}
}
