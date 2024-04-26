// ypu have to implements library using java class Library
//Methods :- addBook, issueBook, returnBook, showAvailable Books
//Properties :- Array to store tha available books
//Array to store the issued books
//
import java.util.*;

public class Exercise4 {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Library Management System(yes/no) :- ");
        String ans = sc.next();
        ans = ans.toLowerCase();
        System.out.println();
        Library li = new Library();
        while(ans.equals("yes"))
        {
            System.out.println("\nLibrary options");
            System.out.println("1. Add new Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show all available Book");
            System.out.println("5. Sign Out");

            int res = sc.nextInt();
            if(res==1) li.addBook();
            else if(res==2) li.issueBook();
            else if(res==3) li.returnBook();
            else if(res==4) li.showAvailableBook();
            else if(res==5) break;
            else System.out.println("\nInvaild Options try again\n");

        }
        System.out.println("Successfully Sign Out");


    }
}

class Library{
    HashMap<Integer,String> book = new HashMap<>();
    HashMap<Integer,Integer> quanBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    void addBook()
    { 
        System.out.print("Enter Book Id : ");
        int bookID = sc.nextInt();
        if(book.containsKey(bookID))
        {
            System.out.println("This book is already available in Library");
            System.out.println("Book ID : "+ bookID);
            System.out.println("Book Name : "+ book.get(bookID));
            System.out.println("Enter the No. of quantity you want to add: " );
            int qbook = sc.nextInt();
            quanBook.put(bookID,quanBook.get(bookID)+qbook);   
        }
        else{
            System.out.print("Enter Book Name : ");
            String bookName = sc.next();
            System.out.print("Enter the qunatity of "+bookName+" : ");
            int qBook = sc.nextInt();
            book.put(bookID,bookName);
            quanBook.put(bookID,qBook); 
        }

    }
    void issueBook()
    {
        System.out.print("Enter the Book ID :- ");
        int bookID = sc.nextInt();
        if(book.containsKey(bookID))
        {
            
            System.out.print("\nEnter the Book ID :- " + bookID);
            System.out.println("\nBook Name :- " +book.get(bookID));
            System.out.println("Available quantity :- " +quanBook.get(bookID)+"\n");
            System.out.println("Do you want to take this book (yes/no) :- ");
            String ans = sc.next();
            ans = ans.toLowerCase();
            if(ans.equals("yes"))
            {
                quanBook.put(bookID,quanBook.get(bookID)-1);
            }
            System.out.println("\nTranscation completed\n");
        }
        else
        {
            System.out.println("This Book is not available !!");
        }
    }
    void returnBook()
    {
        System.out.print("Enter the Book ID :- ");
        int bookID = sc.nextInt();
        if(book.containsKey(bookID))
        {
            quanBook.put(bookID,quanBook.get(bookID)+1);
            System.out.println("\nBook returned successfully\n");
        }
        else{
            System.out.println("Worng ID");
        }
    }
    void showAvailableBook()
    {
        System.out.println("List of Available Books\n");
        System.out.println("Book ID : Book Name : No. of Books Available\n");

        for(Map.Entry<Integer,String> aviBook : book.entrySet())
        {
            System.out.println(aviBook.getKey() +" -- "+ aviBook.getValue()+" -- "+ quanBook.get(aviBook.getKey()));
        }
        System.out.println("\n");
    }
}