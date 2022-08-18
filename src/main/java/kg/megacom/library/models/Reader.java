package kg.megacom.library.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String lastName;
    String patronymic;
    String address;

    @Temporal(TemporalType.TIMESTAMP)
    Date ticketNumber;
    @PrePersist
    protected void onCreate() {
        ticketNumber = new Date();
    }
    @JsonFormat(pattern="dd/MM/yyyy")
    Date birthDate;
    int age;
}
