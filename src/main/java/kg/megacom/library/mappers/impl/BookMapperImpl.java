package kg.megacom.library.mappers.impl;

import kg.megacom.library.mappers.BookMapper;
import kg.megacom.library.models.Author;
import kg.megacom.library.models.Book;
import kg.megacom.library.models.dto.BookDto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BookMapperImpl implements BookMapper {
    @Override
    public Book fromDto(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setAuthors((Set<Author>) bookDto.getAuthors());
        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setPrice(book.getPrice());
        bookDto.setAuthors((List<Author>) book.getAuthors());
        return bookDto;
    }

    @Override
    public List<Book> fromDtos(List<BookDto> bookDtos) {
        return bookDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<BookDto> toDtos(List<Book> books) {
        return books.stream().map((x) -> toDto(x)).collect(Collectors.toList());
    }
}
