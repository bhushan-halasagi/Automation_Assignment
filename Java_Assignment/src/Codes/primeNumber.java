package Codes;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		int no = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= no / 2; ++i) {
			if (no % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(no + " is a prime number.");
		else
			System.out.println(no + " is not a prime number.");

	}

}
