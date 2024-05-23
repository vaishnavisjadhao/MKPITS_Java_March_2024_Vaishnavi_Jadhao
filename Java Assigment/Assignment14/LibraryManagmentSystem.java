package arraylists.lbm;

import java.util.ArrayList;

public class LibraryManagmentSystem {
     ArrayList <Book> books = new ArrayList<>();

     //Adda books
    public void addBooks(Book book) {
        books.add(book);
        System.out.println("Book Added:" +book);
    }

    //Remove Book
    public void removeBook(int ISBN) {
        books.removeIf(book -> book.getISBN()==(ISBN));
    }

    public void searchBookByISBN(int ISBN) {
        for (Book book: books) {
            if (book.getISBN() == ISBN) {
                System.out.println("Book Found: " + book);
                return;
            }
        }
        System.out.println("Book with ISBN" + ISBN + "Not Found");
    }

    public void displayBooks() {
        if(books.isEmpty()){
            System.out.println("No Book in the library");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

//    ---------------------------------Main Method

    public static void main(String[] args) {
        LibraryManagmentSystem library = new LibraryManagmentSystem();

        //add data
         library.addBooks(new Book(1234567890, "The Great Gatsby", "F. Scott Fitzgerald", 1925));
         library.addBooks(new Book(465665443, "To Kill a Mockingbird", "Harper Lee", 1960));
         library.addBooks(new Book(1122334455, "1984", "George Orwell", 1949));

         //remove book by ISBN
        int removeISBN = 465665443;
        library.removeBook(removeISBN);
        System.out.println("\nAfter removing book with ISBN " + removeISBN + ":");

        //Search book br isbn
        System.out.println("\nSearch Student by ISBN is 1234567890");
        library.searchBookByISBN(1234567890);

        System.out.println("\nDisplay All Book");
        library.displayBooks();
    }
}
