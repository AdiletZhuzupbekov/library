package kg.megacom.library.mappers;

import kg.megacom.library.models.Author;
import kg.megacom.library.models.Book;
import kg.megacom.library.models.dto.AuthorDto;
import kg.megacom.library.models.dto.BookDto;

import java.util.List;

public interface BookMapper {

    Book fromDto(BookDto bookDto);
    BookDto toDto(Book book);

    List<Book> fromDtos(List<BookDto> bookDtos);
    List<BookDto> toDtos(List<Book> books);
}
