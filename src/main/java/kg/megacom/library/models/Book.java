package kg.megacom.library.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    @ManyToMany
            @JoinTable(
                    name = "book_authors",
                    joinColumns = @JoinColumn(name="book_id"),
                    inverseJoinColumns = @JoinColumn(name="author_id")
            )
    Set<Author> authors;
    double price;
}
