package com.MphasisTraining;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		double num1, num2, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator : +, -, *, /");
		operator = input.next().charAt(0);
		System.out.println("enter the First number");
		num1 = input.nextDouble();
		System.out.println("Enter the second number");
		num2 = input.nextDouble();
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1 - num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = num1 - num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid operator");
			break;

		}
		input.close();
	}

}
