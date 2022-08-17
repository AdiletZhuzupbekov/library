package kg.megacom.library.models.dto;

import kg.megacom.library.models.Book;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class AuthorDto {


    Long id;
    String name;
    Set<Book> books;
}
