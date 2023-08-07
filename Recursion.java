package recursion;

import java.util.List;

public class Recursion {
//program to find sum of integers of arrayList or array
	public int calculate_sum_using_recursion(List<Integer> arr, int i, int length) {
// base condition - when reached end of the array
// return 0
		if (i == length) {
			return 0;
		}
// recursive condition - current element + sum of
// (n-1) elements
		return arr.get(i) + calculate_sum_using_recursion(arr, i + 1, length);

	}

	// program to find nth fibonacci number
	// we can use static or without static
	public static int calculatenNthFibonacci(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return calculatenNthFibonacci(n - 1) + calculatenNthFibonacci(n - 2);
	}

	// program to find print 1 to N
	public static void printN(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		printN(n - 1);
		System.out.println(n);

	}

	// multiply two numbers
	static int multiply(int x, int y) {
		/* 0 multiplied with anything gives 0 */
		if (y == 0)
			return 0;
		/* Add x one by one */
		if (y > 0)
			return (x + multiply(x, y - 1)); // a*b = a+a*b-1
		/* the case where y is negative */
		if (y < 0)
			return -multiply(x, -y);
		return -1;
	}

	// recursive program to get sum of digits of a number
	static int sumOfDigits(int n) {
		// repeat n=n%10 and n=n/10
		if (n == 0)
			return 0;
		return n % 10 + sumOfDigits(n / 10);
	}

	static int lengthOfString(String str) {
		if (str.equals(""))
			return 0;
		else
			return lengthOfString(str.substring(1)) + 1;
	}

	static int factorial(int n) {
		// p!=p*(p-1);
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	// recursion to calculate nCr
	static double calclateNcr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	// recursion to reverse string
	static String reverseString(String s) {
		if (s == "")
			return s;
		// reverse of abcd is d +reverse of abc
		return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
	}

	public static void main(String[] args) {
		Recursion obj = new Recursion();
		int N = 5, total_sum = 0;
		List<Integer> arr = List.of(89, 75, 82, 60, 95);// { 89, 75, 82, 60, 95 };
		total_sum = obj.calculate_sum_using_recursion(arr, 0, arr.size());
		System.out.println("The total of N numbers is : " + total_sum);
		System.out.println("-------");
		// nth fibonacci number
		System.out.println(Recursion.calculatenNthFibonacci(7));
		System.out.println(Recursion.calculatenNthFibonacci(8));
		System.out.println("-----------");
		// print 1 to N
		Recursion.printN(9);
		System.out.println("-----------");

		// multiply two numbers
		System.out.println(Recursion.multiply(9, 5));
		System.out.println(Recursion.multiply(9, -5));
		System.out.println(Recursion.multiply(-5, -5));
		System.out.println(Recursion.multiply(-5, 5));

		System.out.println(Recursion.sumOfDigits(1234));
		System.out.println("Factorial of 7 is " + Recursion.factorial(7));
		System.out.println("nCr of 7 and 3 is " + Recursion.calclateNcr(7, 3));
		System.out.println(Recursion.reverseString("abcdefgh"));

	}
}
