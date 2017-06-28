package GUVI;
import java.util.Scanner;
public class Factorial {

	
	public static void main(String[] args) {
		 int number;
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int i;
		int fact=1;
	    
	    for( i=1;i<=number;i++)
	    {
	    	fact=fact*i;
	    }
		
       System.out.println(fact);
	}

}
