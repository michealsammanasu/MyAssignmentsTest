package week1.Day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		int a[]={1,4,3,2,8,6,7};
		Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=(i+1))
		{
			System.out.println("Missing number is " +(i+1));
			break;
		}
	}
	
	}

}
