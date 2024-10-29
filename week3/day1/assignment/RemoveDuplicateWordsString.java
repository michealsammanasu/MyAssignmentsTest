package week3.day1.assignment;

public class RemoveDuplicateWordsString {

	public static void main(String[] args) {
		
		int flag=0;
		String oriString="We learn Java basics as part of java sessions in java week1";
		String[] arrString=oriString.split(" ");
		for(int i=0;i<arrString.length-1;i++)
		{
			for(int j=i+1;j<arrString.length;j++)
			{
				if(arrString[i].equalsIgnoreCase(arrString[j]))
				{
					arrString[j]="";
					flag=1;
				}
			}
			
		}
		if(flag==1)
		{
			for(int i=0;i<arrString.length;i++)
			{
				System.out.print(arrString[i]+" ");
			}
		}
		
		
	}

}
