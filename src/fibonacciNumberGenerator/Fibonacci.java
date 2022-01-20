package fibonacciNumberGenerator;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		basicFibonacciGenerator();
		//System.out.println(fibAtPos(4));
		//System.out.println(fibAtPos(4, true));
	}

	/**
	 * @param n           - position of fibonacci number to return (zero indexed)
	 * @param startAtZero - start at zero? (otherwise start at 1)
	 * @return the number at the n'th position of fibonacci sequence (zero indexed)
	 */
	public static long fibAtPos(int n, boolean startAtZero) {
		long fibonacciNum = -1;
		long[] preceedingNums = new long[] { (startAtZero) ? 0 : 1, 1 };
		for (int nth = 1; nth < n; nth++) {
			fibonacciNum = preceedingNums[0] + preceedingNums[1];
			preceedingNums[0] = preceedingNums[1];
			preceedingNums[1] = fibonacciNum;
		}
		return fibonacciNum;
	}

	/**
	 * @param n - refers to the n'th number in the fibonacci sequence
	 * @return the number at the n'th posititon in the fibonacci sequence
	 */
	public static int fibAtPos(int n) {
		ArrayList<Integer> nums = new ArrayList<Integer>(47);
		nums.add(0);
		nums.add(1);
		int fib = 0;
		for (int i = 2; fib >= 0 && i <= n; i++) {
			fib = nums.get(i - 2) + nums.get(i - 1);
			nums.add(fib);
		}
		return fib;
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
