// Java Program to print pattern 
// Hollow Hourglass Pattern 
import java.util.*; 

public class Main { 

	public static void printPattern(int n) 
	{ 
		int i, j; 
	
		for (i = 1; i <= n; i++) { 
			for (j = 1; j < i; j++) { 
				System.out.print(" "); 
			} 
			for (j = i; j <= n; j++) { 
				if(j==i||j==n||i==1) 
					System.out.print("* "); 
				else
					System.out.print(" "); 
			} 
			System.out.println(); 
		} 
		for (i = n - 1; i >= 1; i--) { 
			for (j = 1; j < i; j++) { 
				System.out.print(" "); 
			} 
			for (j = i; j <= n; j++) { 
				if(j==i||j==n||i==1) 
					System.out.print("* "); 
				else
					System.out.print(" "); 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
		printPattern(n); 
	} 
}
