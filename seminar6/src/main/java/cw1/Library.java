package cw1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Library implements Searchable{
    private List<Book> allBooks = new ArrayList<>();

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: allBooks) {
            if (book.getAuthor().equals(author))
                result.add(book);
        }
        return result;
    }

    @Override
    public List<Book> searchByGenre(Genre bookgenre) {
        List<Book> result = new ArrayList<>();
        for (Book book: allBooks) {
            if (book.getBookGenre().equals(bookgenre))
                result.add(book);
        }
        return result;
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }
}
