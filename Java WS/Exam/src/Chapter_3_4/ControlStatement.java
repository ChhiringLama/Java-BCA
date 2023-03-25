package Chapter_3_4;
import java.util.Scanner;

public class ControlStatement {
	
	//Control statement as name suggests determines/controls whether 
	//the next statement should be executed or not 
		public static void main(String[] args) {
			int a=5;
			
			//If statement
			if(a==5) {
				System.out.println("A is 5");
			}else if (a==15) {
				System.out.println("A is 15");
			}else {
				System.out.println("A is empty");
			}
			
			//Switch
			
			int x;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a value for x");
			x=scan.nextInt();
			
			switch(x) {
			case 1:System.out.println("You have selected 1");
			 break;
			case 2: System.out.println("You have selected 2");
				break;
			case 3: return;
			default: System.out.println("Wrong input");
			}
			
			//while
			
			int c=0;
			while(c<10) {
				c++;
				System.out.println(c);
			}
			
			//dowhilte
			System.out.println(" ");
			int d=0;
			do {
				System.out.println(d++);
			}while(d!=10);
		
			//for each mainly used to fetch values from a collection data type
			int arr[]= {2,4,1,6};
			for ( int b:arr){
				System.out.println("This is from for each loop "+b);
			}
		}
	
}
