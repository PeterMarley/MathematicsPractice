package fibonacciNumberGenerator;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		basicFibonacciGenerator();
		System.out.println(retrieveFibonacciNumberAtPostition(4));
	}

	public static int retriveFibNumAtPostRecusrively(int n) {
		// base case is n == 1?
		
		return -1;
	}
	
	/**
	 * @param n - refers to the n'th number in the fibonacci sequence
	 * @return the number at the n'th posititon in the fibonacci sequence
	 */
	public static int retrieveFibonacciNumberAtPostition(int n) {
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
		int num1, num2;
		num1 = 0;
		num2 = 1;
		boolean hasOverflowed = false;
		for (int i = 0; !hasOverflowed; i++) {
			int fibonacciNumber = num1 + num2;
			num1 = num2;
			num2 = fibonacciNumber;
			if (fibonacciNumber >= 0) {
				System.out.println("pass " + (i + 1) + ": " + fibonacciNumber);
			} else {
				System.out.println("Overflow reached on pass " + (i + 1));
				hasOverflowed = true;
			}

		}
	}
}
