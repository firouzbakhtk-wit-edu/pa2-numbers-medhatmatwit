package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter five whole numbers: ");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();

		int sum = num1 + num2 + num3 + num4 + num5;
		int positiveSum = 0;
		int nonPositiveSum = 0;
		int positiveCount = 0;
		int nonPositiveCount = 0;

		if (num1 > 0) {
			positiveSum += num1;
			positiveCount++;
		} else {
			nonPositiveSum += num1;
			nonPositiveCount++;
		}

		if (num2 > 0) {
			positiveSum += num2;
			positiveCount++;
		} else {
			nonPositiveSum += num2;
			nonPositiveCount++;
		}

		if (num3 > 0) {
			positiveSum += num3;
			positiveCount++;
		} else {
			nonPositiveSum += num3;
			nonPositiveCount++;
		}

		if (num4 > 0) {
			positiveSum += num4;
			positiveCount++;
		} else {
			nonPositiveSum += num4;
			nonPositiveCount++;
		}

		if (num5 > 0) {
			positiveSum += num5;
			positiveCount++;
		} else {
			nonPositiveSum += num5;
			nonPositiveCount++;
		}

		System.out.println("The sum of the " + positiveCount + " positive numbers: " + positiveSum);
		System.out.println("The sum of the " + nonPositiveCount + " non-positive numbers: " + nonPositiveSum);
		System.out.println("The sum of the 5 numbers: " + sum);

		if (positiveCount > 0) {
			System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount,
					(double) positiveSum / positiveCount);
		}
		if (nonPositiveCount > 0) {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount,
					(double) nonPositiveSum / nonPositiveCount);
		}

		if (positiveCount > 0) {
			System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount,
					(double) positiveSum / positiveCount);
		}

		if (nonPositiveCount > 0) {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount,
					(double) nonPositiveSum / nonPositiveCount);
		}

		System.out.printf("The average of the 5 numbers: %.2f%n", (double) sum / 5);

		scanner.close();
	}
}
