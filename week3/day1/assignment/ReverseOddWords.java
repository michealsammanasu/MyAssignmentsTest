package week3.day1.assignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String oriWords="I am a software tester";
		String[] arrWords=oriWords.split(" ");
		String tempStr="";
		
		for(int i=1;i<arrWords.length;i+=2)
		{
			
			for(int j=arrWords[i].length()-1;j>=0;j--)
			{
			tempStr=tempStr+arrWords[i].charAt(j);
			}
			
			arrWords[i]=tempStr;
			tempStr="";
		}
		
		for(int i=0;i<arrWords.length;i++)
		{
			System.out.print(arrWords[i]+" ");
		}
	}

}
