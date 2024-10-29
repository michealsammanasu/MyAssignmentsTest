package week3.day1.assignment;

public class oddIndexUpperCase {

	public static void main(String[] args) 
	{
		String strToUpper="changeme";
		//converting string to char array
		char[] chToUpper=strToUpper.toCharArray();
		System.out.println(chToUpper);
		
		//converting and storing the odd index char in Upper case
		
		for (int i = 1; i < chToUpper.length; i+=2) 
		{
			chToUpper[i]=Character.toUpperCase(chToUpper[i]);
			
		}
		System.out.println(chToUpper);
	}

}
