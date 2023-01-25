package Codes;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int first = 0, second = 1;
		System.out.println("Fibonacci Series for " + no + " is: ");

		for (int i = 1; i <= no; ++i) {
			System.out.print(first + ", ");

			int next = first + second;
			first = second;
			second = next;
		}

	}

}
