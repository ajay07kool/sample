package com.alacriti.demo.test;

import java.util.Scanner;

public class ChangeTest {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amonut: ");
		int num = sc.nextInt();
		int coin2 = 0;
		int coin5 = 0;
		int coin10 = 0;

		if (num < 0) {
			System.out.println("Not a valid number");
			System.exit(1);
		} else {

			if (num >= 10) {

				coin10 = num / 10;
				num = num % 10;

				if ((num % 10 == 1) || (num % 5 == 3)) {
					coin10 = coin10 - 1;
					num = num + 10;
				}

			}
			if (num >= 5) {

				coin5 = num / 5;
				num = num % 5;

				if ((num % 5 == 1) || (num % 5 == 3)) {
					coin5 = coin5 - 1;
					num = num + 5;
				}
			}
			if ((num >= 2) && ((num % 2 != 1))) {

				coin2 = num / 2;
				num = num % 2;
			}

			if (num % 2 == 1) {
				System.out.println("not possible to get change...");
			} else {

				System.out.println("no. of coin10: " + coin10);
				System.out.println("no. of coin5: " + coin5);
				System.out.println("no. of coin2: " + coin2);
				System.out.println((10 * coin10) + (5 * coin5) + (2 * coin2)
						+ " is the total cost");
			}

		}

	}
}
