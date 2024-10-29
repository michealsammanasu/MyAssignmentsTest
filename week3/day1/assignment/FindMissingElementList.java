package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		//adding the numbers into the list
		List<Integer> listEle=new ArrayList<Integer>();
		listEle.add(1);
		listEle.add(2);
		listEle.add(3);
		listEle.add(4);
		listEle.add(10);
		listEle.add(6);
		listEle.add(8);
		
		//sorting the list
		Collections.sort(listEle);
		
		//Printing missing numbers
		System.out.println("Missing numbers are ");
		for(int i=0;i<listEle.size();i++)
		{
			if((i+1)!=listEle.get(i))
			{
				System.out.print(i+1+" ");
			}
		}
		

	}

}
