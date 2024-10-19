package week1.Day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=121,output=0;
		int rem=0;
		for(int i=input;i>0;i/=10)
		{
			rem=i%10;
			output=output*10+rem;
		}
		if(input==output)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
