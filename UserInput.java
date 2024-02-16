import java.util.*;

class UserInput{
 Scanner sc = new Scanner(System.in);

 // Function to take input for two numbers
 public double[] InpN(){
 System.out.println("Enter first number:");
 double n1 = sc.nextDouble();
 System.out.println("Enter second number:");
 double n2 = sc.nextDouble();

// Returning entered numbers in an array
 double[] numbers = new double[2];
 numbers[0] = n1;
 numbers[1] = n2;

 // Returns array containing two numbers
 return numbers;
 }

 // Function to take input for array of size n
 public int[] ArrN(int n){
 System.out.println("Enter elements of array:");
 int[] arr = new int[50];
 for(int i = 0;i<n;i++)
 {
 arr[i] = sc.nextInt();
 }

 // Returning array containing integers taken as input
 return arr;
 }

 }