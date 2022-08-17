package kg.megacom.library.models.dto;

import kg.megacom.library.models.Author;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto {


    Long id;
    String title;
    List<Author> authors;
    double price;
}
