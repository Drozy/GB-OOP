package cw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookGenre implements Genre {
    String genreName;


    @Override
    public String getGenre() {
        return genreName;
    }
}
