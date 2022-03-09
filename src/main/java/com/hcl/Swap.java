package com.hcl;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number = ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number = ");
		int num2 = scan.nextInt();

		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping");
		System.out.println("Value of first number =" + num1);
		System.out.println("Value of second number =" + num2);
	}

}
