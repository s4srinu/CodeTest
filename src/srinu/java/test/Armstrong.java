package srinu.java.test;

import java.util.Scanner;

public class Armstrong {
	// 0, 1, 153, 370, 371, 407
	//1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	public static void main(String[] args) {

		int c = 0, a, temp;
		int n ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		n = in.nextInt();
		temp = n;
		while (n > 0)
		{
			a = n % 10;
			c = c + (a * a * a);
			n = n / 10;
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
