package week3.day1.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		//Create a list with first array of elements
		List<Integer> arrList1=new ArrayList<Integer>();
		for (int j = 0; j < arr1.length; j++) {
			arrList1.add(arr1[j]);
		}

		//Create a list with second array of elements
		List<Integer> arrList2=new ArrayList<Integer>();
		for (int j = 0; j < arr2.length; j++) {
			arrList2.add(arr2[j]);
		}
		
		// finding intersection of numbers
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr2.length;j++)
			{
				if (arrList1.get(i)==arrList2.get(j)) //verify both are equal thats intersect
				
				{
				System.out.print(arrList1.get(i)+" ");
				}
			}
		}
		
	}

}
