
import java.util.*;

public class Main {
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in)
		int n = sc.nextInt();
		int i, j;
		int num = 1;


		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (i = n-1; i >= 1; i--) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	}

