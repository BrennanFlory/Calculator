package edu.hartwick.floryb.calculator;

import edu.hartwick.floryb.mywindow.MyWindow;

public class calculator extends MyWindow {

	public calculator() {
		String s = "Y";
		while (s.startsWith("Y") || s.startsWith("y")) {
			double a = promptForDouble("Enter a number");
			String operation = promptForString("Enter +, - , *, or /");
			double b = promptForDouble("Enter another number");
			double c = 0;
			switch (operation) {
			case "+":
				c = a + b;
				print(a + " + " + b + " = " + c);
				break;
			case "-":
				c = a - b;
				print(a + " - " + b + " = " + c);
				break;
			case "*":
				c = a * b;
				print(a + " * " + b + " = " + c);
				break;
			case "/":
				try {
					c = a / b;
					print(a + " / " + b + " = " + c);
				}
				catch(ArithmeticException e) {
					print("Division by zero is not allowed.");
				}
				break;
			default:
				print(operation + " is not a valid operation.");
			}
			s = promptForString("Do you want to do another?");
		}
	}

	public static void main(String[] args) {
		new calculator();

	}

}
