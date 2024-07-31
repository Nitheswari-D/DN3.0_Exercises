package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "1984", "George Orwell");
        Book book3 = new Book(3, "To Kill a Mockingbird", "Harper Lee");
        Book book4 = new Book(4, "The Catcher in the Rye", "J.D. Salinger");
        Book book5 = new Book(5, "Pride and Prejudice", "Jane Austen");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("All Books in Library:");
        library.displayBooks();

        System.out.println("\nLinear Search for '1984':");
        Book linearSearchResult = library.linearSearchByTitle("1984");
        System.out.println(linearSearchResult != null ? linearSearchResult : "Book not found");

        System.out.println("\nBinary Search for '1984':");
        Book binarySearchResult = library.binarySearchByTitle("1984");
        System.out.println(binarySearchResult != null ? binarySearchResult : "Book not found");
    }
}

