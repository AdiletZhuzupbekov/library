package kg.megacom.library.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.PrePersist;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReaderDto {
    Long id;
    String name;
    String lastName;
    String patronymic;
    String address;
    Date ticketNumber;
    Date birthDate;


}
