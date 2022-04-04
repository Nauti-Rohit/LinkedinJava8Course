package com;

import java.util.Scanner;

public class ComplexCalculater {
	public static void main(String[] args) {
		int ch;
		do {
			int num1, num2, add, mul, sub;
			float div;
			System.out.println("__________________________");
			System.out.println("\tCALCULATOR");
			System.out.println("__________________________");
			System.out.println("Select the Operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Select the option: ");
			Scanner scn = new Scanner(System.in);
			ch = scn.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter num1");
				num1 = scn.nextInt();
				System.out.println("Enter num2");
				num2 = scn.nextInt();
				add = num1 + num2;
				System.out.println("Addition: " + add);
				System.out.println();
				break;
			case 2:
				System.out.println("Enter num1");
				num1 = scn.nextInt();
				System.out.println("Enter num2");
				num2 = scn.nextInt();
				sub = num1 - num2;
				System.out.println("Subtraction: " + sub);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter num1");
				num1 = scn.nextInt();
				System.out.println("Enter num2");
				num2 = scn.nextInt();
				mul = num1 * num2;
				System.out.println("Multiplication: " + mul);
				System.out.println();
				break;
			case 4:
				System.out.println("Enter num1");
				num1 = scn.nextInt();
				System.out.println("Enter num2");
				num2 = scn.nextInt();
				div = num1 / num2;
				System.out.println("Division: " + div);
				System.out.println();
				break;
			case 5:
				System.out.println("****************Thank you for visiting****************");
				break;
			default:
				System.out.println("****************Invalid option selected***************");

			}
		} while (ch != 5);
	}
}
