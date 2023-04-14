package cw1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ElectronBook extends Book {
    String format;
    Double size;


    public ElectronBook(String name, String author, Integer year, Integer pages, String publisher, BookGenre bookGenre, String format, Double size) {
        super(name, author, year, pages, publisher, bookGenre);
        this.format = format;
        this.size = size;
    }
}
