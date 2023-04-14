package cw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private Integer year;
    private Integer pages;
    private String publisher;
    private Genre bookGenre;

}
