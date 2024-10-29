package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) 
	{
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		//sort the string array
		Arrays.sort(arr);
		//store the array in the list
		List<String> listArr=new ArrayList<String>();
		for(String s:arr)
		{
			listArr.add(s);
		}
		//reverse the list and print it
		Collections.reverse(listArr);
		System.out.println(listArr);
	}

}
