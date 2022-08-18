package kg.megacom.library.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(
                    name = "book_authors",
                    joinColumns = @JoinColumn(name="book_id"),
                    inverseJoinColumns = @JoinColumn(name="author_id")
            )
    Set<Author> authors;
    double price;
}
