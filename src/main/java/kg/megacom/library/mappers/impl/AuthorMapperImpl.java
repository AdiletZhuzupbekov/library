package kg.megacom.library.mappers.impl;

import kg.megacom.library.mappers.AuthorMapper;
import kg.megacom.library.models.Author;
import kg.megacom.library.models.dto.AuthorDto;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public Author fromDto(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setName(authorDto.getName());
        return author;
    }

    @Override
    public AuthorDto toDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        return authorDto;
    }

    @Override
    public List<Author> fromDtos(List<AuthorDto> authorDtos) {
        return authorDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<AuthorDto> toDtos(List<Author> authors) {
        return authors.stream().map((x) -> toDto(x)).collect(Collectors.toList());

//        List<AuthorDto> authorDtos = new ArrayList<>();
//
//        for (Author item: authors) {
//            AuthorDto authorDto = toDto(item);
//            authorDtos.add(authorDto);
//        }


    }
}
