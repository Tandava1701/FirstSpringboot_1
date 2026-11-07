package com.example.FirstProject;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			double firstNumber = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			double secondNumber = scanner.nextDouble();

			System.out.println("Sum: " + (firstNumber + secondNumber));
		}
	}
}