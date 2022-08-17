package kg.megacom.library.models.dto;

import kg.megacom.library.models.Book;
import kg.megacom.library.models.OperationStatus;
import kg.megacom.library.models.Reader;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OperationsDto {
    Long id;
    Date startDate;
    Date endDate;
    Reader reader;
    Book book;
    OperationStatus status;

}