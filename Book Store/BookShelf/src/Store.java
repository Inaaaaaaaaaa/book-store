import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	private ArrayList<String> books;
	
	public Store()
	{
		books = new ArrayList<>();
	}
	
	//adding books
	public void addBook(String booktitle)
	{
		books.add(booktitle);
		System.out.println(" " + booktitle + " has been added!");
	}

	//checking status of borrowed book
	public void viewborrowedbook()
	{
		if(books.isEmpty())
		{
			System.out.println("No borrowed books.");
		}
		else
		{
			System.out.println("Your borrowed books are: ");
			
			for(String book : books)
			{
				System.out.println(book);
			}
		}
	}
	
	public static void main(String[] args) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		int user_input = 0;
		Store store = new Store();
		
		while(user_input != 3)
		{
			System.out.println("\nWelcome to the Book store menu!");
			System.out.println("---------------------------------");
			System.out.println("\n1. View borrowed books");
			System.out.println("2. Check out");
			System.out.println("3. Exit");
			System.out.println("Please enter an output: ");
			user_input = scan.nextInt();
			
			switch(user_input)
			{
			case 1:
				store.viewborrowedbook();
				break;
				
			case 2:
				System.out.println("Enter the title of the book: ");
				String booktitle = scan.next();
				store.addBook(booktitle); //adding new book and storing into store
				break;
				
			case 3:
				System.out.println("Thank you for visiting! Exiting program...");
				break;
				
			default:
				System.out.println("\nPlease enter a valid input.");
				continue;
			}
		}
		
		//close resource leak
		scan.close();
	}

}
