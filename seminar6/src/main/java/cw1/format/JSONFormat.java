package cw1.format;

import cw1.Book;

public class JSONFormat implements Formatter{
    @Override
    public String format(Book book) {
        return "Книга " + book.getName() + " преобразована в формат JSON";
    }
}
