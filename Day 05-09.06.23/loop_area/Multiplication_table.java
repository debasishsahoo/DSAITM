package loop_area;
import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
		
		int j,n;

	System.out.println("Input the number(Table to be calculated): ");
		  {
		   System.out.println("Input number of terms : ");
		    Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   System.out.println ("\n");
		   for(j=0;j<=10;j++)
		  
		     System.out.println(n+" X "+j+" = " +n*j);
		   }
	}

}
