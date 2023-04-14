package cw1;

import java.util.List;

public interface Searchable {
    List<Book> searchByAuthor(String author);
    List<Book> searchByGenre(Genre bookgenre);

}
