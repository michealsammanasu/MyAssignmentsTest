package week1.Day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String text1="stops";
		String text2="potss";
		char[] ch1=text1.toCharArray();
		char[] ch2=text2.toCharArray();
		if(text1.length()==text2.length())
		{
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
			System.out.println("The inputs are anagram");
		else
			System.out.println("The inputs are not anagram");
		}
		else
			System.out.println("The inputs are not a anagram");
		
	}

}
