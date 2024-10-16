package week1.Day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=8,firstNumber=0,secondNumber=1,nextNumber = 0;
		System.out.print(firstNumber+","+secondNumber);
		for(int i=0;i<n-2;i++)
		{
			
			nextNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			System.out.print(","+nextNumber);
		}
		

	}

}
