package srinu.java.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your String");
		
		String str = "Automation";

		str = in.nextLine();

		StringBuilder str2 = new StringBuilder();

		str2.append(str);

		str2 = str2.reverse(); // used string builder to reverse

		System.out.println(str2);
		
		useToCharArray(str);
		
		useSwap(str);
		
		String rev =recursiveMethod(str);
		
		System.out.println(rev);

	}

	public static void useToCharArray(String input) {

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);

		System.out.println();
	}

	public static void useSwap(String input) {
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}
	
	public static String recursiveMethod(String str)
	    {
	         if ((null == str) || (str.length() <= 1))
	         {
	                return str;
	         }
	 System.out.println(str.substring(1));
	 System.out.println(str.charAt(0));

	 return recursiveMethod(str.substring(1)) + str.charAt(0);
	    }

}
