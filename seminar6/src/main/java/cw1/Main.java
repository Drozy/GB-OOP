package cw1;

import cw1.format.Formatter;
import cw1.format.HTMLFormat;
import cw1.format.JSONFormat;

public class Main {
    public static void main(String[] args) {
        BookGenre bookGenre1 = new BookGenre("horror");
        BookGenre bookGenre2 = new BookGenre("fantasy");
        Book book1 = new Book("Qwe", "SD", 2012, 354, "Good", bookGenre1);
        ElectronBook electronBook1 = new ElectronBook("Rty", "SD", 2008, 327, "Bad", bookGenre2, "txt", 103.5);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(electronBook1);

        System.out.println("library.searchByAuthor(\"sd\") = " + library.searchByAuthor("SD"));
        Formatter formatter1 = new HTMLFormat();
        Formatter formatter2 = new JSONFormat();
        System.out.println("formatter1.format(book1) = " + formatter1.format(book1));
        System.out.println("formatter2.format(electronBook1) = " + formatter2.format(electronBook1));
        System.out.println(library.searchByGenre(new BookGenre("horror")));

    }
}