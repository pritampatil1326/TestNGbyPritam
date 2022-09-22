package Assignments;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num = sc.nextInt();
		int mult=1;
		for(int i=1; i<=num; i++)
		{
			mult=mult*i;
		}
		System.out.println("Factorial is "+mult);
		// chnages by vaishnavi....
	}

}

/* OUTPUT
Enter number to find factorial
12
Factorial is 479001600
*/