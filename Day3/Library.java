package week1.Day3;

public class Library {

	String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library lib=new Library();
		System.out.println("Book title is " +lib.addBook("The Snowy Day"));
		lib.issueBook();

	}

}
