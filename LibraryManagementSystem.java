import java.util.ArrayList; // array list imported
import java.util.Scanner;   // scanner class imported

class Book {      // defined a class name as book  to represent a book object 
	String title;
	String author;
	int year;
	
	Book(String title,String author, int year){     // constructor to initialice a book object 
		
	    this.title=title;
		this.author=author;
		this.year=year;
	}
		@Override   //override the tostring 
		public String toString() {
			
		return title +" by " +  author + "(" + year + ")";
		}
	}
	
	public class LibraryManagementSystem {           // define the main class 
		public static void main (String [] args){
			Scanner scanner = new Scanner(System.in);   // create a scanner object to get user input 
			ArrayList<Book> books= new ArrayList<>();   // create an array list to store Book objects
			
			// infnite loop to keep the program running until the user chooses to exit
			
			while (true){  
			
			//display the menu option to the user 
			System.out.println("\nLibrary Management System");
			
			System.out.println("1. Add a book");
			System.out.println("2. Display Books");
			System.out.println("3. Borrow a book");
			System.out.println("4. return a book ");
			System.out.println("5. Exit ");
			System.out.print("choose an option :");
			
			int choise =scanner.nextInt();  //read the user input for menu choise
			switch (choise){
				case 1:
				System.out.print("enter the book title; ");
				String title=scanner.nextLine();  //consume newline leftover
				
				System.out.print("enter the author ;");
				String author=scanner.nextLine();
				
				System.out.print("enter thr year of publication :");
				int year =scanner.nextInt();
				
				scanner.nextLine();  // consume newline
				
				books.add(new Book(title,author,year));  //add the book to the list
				System.out.println("book added sucessfully! ");
			
			
			break;
			case 2:
			if (books.isEmpty()) {
			System.out.println("no books available. ");
			}else {
				System.out.println("available books : ");
				
				for (Book book : books){  //iterete trough the list of books
					System.out.println(book);   //print each book
				}
			}
			break;
			
			case 3:
			
			System.out.println("enter the title to the books to borrow ;");
			String borrowTitle = scanner.nextLine();
			boolean found = false;
			//serch for the book to borrow 
			for (Book book : books){
				if (book.title.equalsIgnoreCase(borrowTitle)){
					books.remove(book);  //remove the book from the list
					
					System.out.println("you have borrowed "+ book);
					found=true;
					break;
				}
			}
			if (!found){
				System.out.println("book not found ");
			}
			break;
			case 4:
			
			System.out.println("enter the title of the book to return ");
			String returnTitle = scanner.nextLine();
			
			System.out.println("enter the author ");
			String returnAuthor = scanner.nextLine();
			
			System.out.println("enter th year of publication ");
		    int returnYear = scanner.nextInt();
			
			scanner.nextLine();
			
			books.add(new Book(returnTitle,returnAuthor,returnYear)); // add the book back to the list

			System.out.println("Books return sucessfully! ");
			break;
			case 5:
			
			System.out.println("exiting the system");
			return;  //exit the program
			default:
			System.out.println("invslid choise , please try again ");
		}
	}
}
}


			
			
				
				
				
				