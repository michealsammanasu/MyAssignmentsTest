package week1.Day3;

public class  IsPrime {

	public static void main(String[] args) {
		
		int primeNumber=39;
		int temp=0;
		for(int i=2;i<primeNumber;i++)
		{
			if(primeNumber%i==0)
			{
				System.out.println("It is not a prime number");
				temp=1;
				break;
			}
			
			
		}
		if(temp==0)
		{
			System.out.println("It is a prime number");
		}

	}

}

