//VANSHIKA TYAGI
//22070126128
//AIML B3


import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]){
		
		// Create instances of Classes UserInput and Calculator
		UserInput userinput = new UserInput();
		Calculator calculator = new Calculator();
		
		// Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements you wish to store:");
		int n = sc.nextInt();
		
		/* Using previously defined objects to get user input for 
		two numbers and array of integer */
		double[] numbers = userinput.InpN();
		int[] arr = userinput.ArrN(n);
		
		System.out.println("Menu");
		System.out.println("Enter choice 1 to perform on array and enter choice 2 to perform on numbers:");
		int ch = sc.nextInt();
		if (ch == 1)
		{
			System.out.println("Enter 1 for sum of array, 2 for variance, 3 for Standard deviation");
			int ch1 = sc.nextInt();
			switch (ch1){
				case 1:
				System.out.println("Sum of array:" + calculator.sumOfArr(arr));
				break;
				case 2:
				System.out.println("Variance of array:"+ calculator.variance(arr));
				break;
				case 3:
				System.out.println("Standard Deviation of array:"+ calculator.stdDev(arr));
				break;
				default:
				System.out.println("Wrong choice entered!");
				break;
			}
		}
		else if (ch == 2){
			System.out.println("Enter choice for calculator: 1 for Addition, 2 for subtraction, 3 for Multiplication, 4 for Division");
			int ch2 = sc.nextInt();
			switch (ch2){
				case 1:
				System.out.println("Addition of two numbers:"+ calculator.addition(numbers[0], numbers[1]));
				break;
				case 2:
				System.out.println("Subtraction of two numbers:"+ calculator.subtraction(numbers[0], numbers[1]));
				break;
				case 3:
				System.out.println("Multiplication of two numbers:" + calculator.multiplication(numbers[0], numbers[1]));
				break;
				case 4:
				System.out.println("Division of two numbers:" + calculator.division(numbers[0], numbers[1]));
				break;
				default:
				System.out.println("Wrong choice entered!");
				break;
			}
		}
		else{
			System.out.println("Wrong choice entered!");
		}
		
		
	}
	
}
	