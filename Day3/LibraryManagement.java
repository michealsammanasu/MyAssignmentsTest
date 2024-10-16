package week1.Day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib1=new Library();
		System.out.println("Book title is "+lib1.addBook("The Very Hungry Caterpillar."));
		lib1.issueBook();

	}

}
