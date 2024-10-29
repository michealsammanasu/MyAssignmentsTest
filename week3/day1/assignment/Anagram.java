package week3.day1.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops",text2="potss";
		
		char[] chArr1=text1.toCharArray();
		char[] chArr2=text2.toCharArray();
		
		if(text1.length()==text2.length())
		{
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			
			if(Arrays.equals(chArr1,chArr2))
			{
				System.out.println("The strings are anagram");
			}
			else
			{
				System.out.println("The strings are not anagram");
			}
		}
		else
		{
			System.out.println("The given strings are not anagram");
		}

	}

}
