package com.hcl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world! We need to build a calculator based Command line app where for
 * each operation, it should take 2 numbers and either add, substract, multiply
 * and divide, add
 * 
 * The based application involves prompting the user for 2 number and implement
 * only add
 * 
 * You have to have a menu driven application, where it show a banner and it
 * show "add, substract, multiply, divide" and if you select add or substract,
 * it should prompt for 2 number and the op and do the operation and show the
 * results and keep prompting the user with the same menu.
 * 
 * the 2 key requirement is it should have a basic banner and it should also be
 * menu driven
 * 
 */
public class App {
	public static void main(String[] args) {
		
		String fileName = "file\\view.txt";
		File file = new File(fileName);

		try {
			boolean status = file.createNewFile();
			if (status) {
				System.out.println("Output file created");
			}
//			else {
//				System.out.println("Failed");
//			}
		}
		catch(IOException err){
			err.printStackTrace();
		}
		
		// Poor mans banner
		System.out.println("Hello World! I am a great calculator :-) ;-) ");

		// creates an object of Scanner
		Scanner input = new Scanner(System.in);
		boolean a = true;
		while (a) {
			float result = 0;

			System.out.println("Enter your operator");
			String operator = input.next();

			System.out.print("Enter first number: ");

			// takes 1st number
			float firstNumber = input.nextFloat();

			// prints the name
			System.out.print("Enter second number: ");

			// takes 2st number
			float secondNumber = input.nextFloat();

			switch (operator) {
			case "+":
				result = firstNumber + secondNumber;
				System.out.printf("sum = %.2f\n", result);
				break;
			case "-":
				result = firstNumber - secondNumber;
				System.out.printf("substract = %.2f\n", result);
				break;
			case "*":
				result = firstNumber * secondNumber;
				System.out.printf("product = %.2f\n", result);
				break;
			case "/":
				result = firstNumber / secondNumber;
				System.out.printf("divide = %.2f\n", result);
				break;
			default:
				System.out.println("Wrong Entry");
				break;
			}



			String view = String.format("%s,%.2f,%.2f,%.2f\n", new Object[] { operator, firstNumber, secondNumber, result });
			
			try {
				FileWriter filewriter = new FileWriter(fileName,true);
				filewriter.write(view);
				filewriter.close();
				System.out.println("Success");
			}
			catch(IOException err) {
				err.printStackTrace();
			}
			System.out.println("Do you want to continue (y/n)");
			input.nextLine();
			String b = input.nextLine();
			a = b.equals("y");
			System.out.println(a);
		}
		System.out.println("program terminated");
		
	}

}
