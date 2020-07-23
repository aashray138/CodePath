package codepath.week6;
import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluation {

	public static void main(String [] args) {

		Scanner bucky = new Scanner (System.in);
		System.out.println("Enter the postfix expression");
		String expression = bucky.nextLine();

		if (expression.length() == 0 || expression.length() < 3) {
			System.out.println("Incorrect Expression");
			System.exit(-1);
		}
		
		expression = expression.replaceAll(" ", "_");
		System.out.println(expression);

		int result = evaluateResult(expression);

		System.out.println(result);
		bucky.close();
	}

	private static int evaluateResult(String expression) {

		Stack<Character> newStack = new Stack<Character>();

		int result = 0;

		for (int i = 0 ; i < expression.length() ; i++) {

			if (expression.charAt(i) == '_') {
				
			} else if (Character.isDigit(expression.charAt(i))) {
				
				// Its a digit got to stack it up 
				newStack.add(expression.charAt(i));

			} else {
				// This is an operation;
				int first = newStack.pop() - 48;
				int second = newStack.pop() - 48;

				char operation = expression.charAt(i);

				if (operation == '+') {
					result = first + second;
				} else if (operation == '-') {
					result = first - second;
				} else if (operation == '*') {
					result = first * second;
				} else if (operation == '/') {
					result = first / second;
				}

				char ch = Character.forDigit(result, 10);
				newStack.add(ch);
			}

		}

		return result;

	}



}
