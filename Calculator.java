import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");

		int firstNumber = sc.nextInt();	

		System.out.print("Enter the second number: ");		

		int secondNumber = sc.nextInt();

		System.out.print("Select an operation (+, -, *, /): ");

		String operation = sc.next();

		int result = 0;

		switch (operation) {

		case "+":
			result = firstNumber + secondNumber;
			break;
		case "-":
		    result = firstNumber - secondNumber;
		    break;

		case "*":
		    result = firstNumber * secondNumber;
		    break;

		case "/":
		    result = firstNumber - secondNumber; 
		    break;
		default: System.out.println("Incorrect operation");
		   break;     	


		}

	System.out.println(result);

	}
}