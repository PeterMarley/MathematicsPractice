package fibonacciNumberGenerator;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		//basicFibonacciGenerator();
		System.out.println(fibAtPos(40));
		//System.out.println(fibAtPos(4, true));
		System.out.println(fibRecursive(40));
	}

	/**
	 * Recursively calculate the fibonacci number at index i of fibonacci sequence (zero-indexed). When index approaches
	 * 50 run time is very bad, but the idea is there.
	 * @param i an int - fibonacci sequence index
	 * @return the number at index i (zero-indexed) of the fibonacci sequence
	 */
	public static long fibRecursive(int i) {
		// establish bases cases
		if (i == 0) {
			return 0;
		}
		if (i <= 2) {
			return 1;
		}
		// call itself recursively until base cases established
		return fibRecursive(i - 1) + fibRecursive(i - 2);
	}

	/**
	 * @param i           - position of fibonacci number to return (zero indexed)
	 * @param startAtZero - start at zero? (otherwise start at 1)
	 * @return the number at the n'th position of fibonacci sequence (zero indexed)
	 */
	public static long fibAtPos(int i) {
		long fibonacciNum = -1;
		long[] preceedingNums = new long[] { 0 , 1 };
		for (int index = 1; index < i; index++) {
			fibonacciNum = preceedingNums[0] + preceedingNums[1];
			preceedingNums[0] = preceedingNums[1];
			preceedingNums[1] = fibonacciNum;
		}
		return fibonacciNum;
	}

	/**
	 * first try at fibonacci number generator
	 */
	public static void basicFibonacciGenerator() {
		long num1, num2;
		num1 = 0;
		num2 = 1;
		boolean hasOverflowed = false;
		for (int i = 0; !hasOverflowed; i++) {
			long fibonacciNumber = num1 + num2;
			num1 = num2;
			num2 = fibonacciNumber;
			if (fibonacciNumber >= 0) {
				System.out.println("pass " + (i + 1) + ": " + fibonacciNumber);
			} else {
				System.out.println("long integer overflow reached on pass " + (i + 1));
				hasOverflowed = true;
			}

		}
	}
}
