class Calculator{
	
	// Function to add two mumbers
	public double addition(double n1, double n2){
		return n1+n2;
	}
	
	// Function to subtract two numbers
	public double subtraction(double n1, double n2){
		return n1-n2;
	}
	
	// Function to multiply two numbers
	public double multiplication(double n1, double n2){
		return n1*n2;
	}
	
	// Function to divide two numbers
	public double division(double n1, double n2){
		return n1/n2;
	}
	
	// Function to calculate sum of array of integers
	public double sumOfArr(int[] arr){
		int sum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	// Function to calculate standard deviation of array of integers
	public double stdDev(int[] arr){
		double formula;
		int sum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		double x_bar = sum/n;
		
		double sumSquaredDifferences = 0;
		for(int i = 0;i<n;i++)
		{
			sumSquaredDifferences += Math.pow((arr[i] - x_bar), 2);
		}
		formula = Math.sqrt(sumSquaredDifferences / (n-1));
		return formula;
	}
	
	// Function to calculate variance of array of integers
	public double variance(int[] arr){
		double form;
		int sum = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		double x_bar = sum/n;
		
		double sumSquaredDifferences = 0;
		for(int i = 0;i<n;i++)
		{
			sumSquaredDifferences += Math.pow((arr[i] - x_bar), 2);
		}
		form = sumSquaredDifferences / (n-1);
		return form;
	}
	
}	