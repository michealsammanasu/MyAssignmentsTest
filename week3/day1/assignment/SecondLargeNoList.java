package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargeNoList {

	public static void main(String[] args) 
	{
		//create a list
		List<Integer> arrList=new ArrayList<Integer>();
		arrList.add(3);
		arrList.add(2);
		arrList.add(11);
		arrList.add(4);
		arrList.add(6);
		arrList.add(7);
		
		//sort the list
		Collections.sort(arrList);
		//print the second large number
		System.out.println(arrList);
		System.out.println("second large number "+arrList.get(arrList.size()-2));

	}

}
