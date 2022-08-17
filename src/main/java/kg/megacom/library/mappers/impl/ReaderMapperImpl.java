package kg.megacom.library.mappers.impl;

import kg.megacom.library.mappers.ReaderMapper;
import kg.megacom.library.models.Reader;
import kg.megacom.library.models.dto.ReaderDto;

import java.util.List;
import java.util.stream.Collectors;

public class ReaderMapperImpl implements ReaderMapper {
    @Override
    public Reader fromDto(ReaderDto readerDto) {
        Reader reader = new Reader();
        reader.setId(readerDto.getId());
        reader.setName(readerDto.getName());
        reader.setLastName(readerDto.getLastName());
        reader.setPatronymic(readerDto.getPatronymic());
        reader.setAddress(readerDto.getAddress());
        reader.setBirthDate(readerDto.getBirthDate());
        reader.setTicketNumber(readerDto.getTicketNumber());
        return reader;
    }

    @Override
    public ReaderDto toDto(Reader reader) {
        ReaderDto readerDto = new ReaderDto();
        readerDto.setId(reader.getId());
        readerDto.setName(reader.getName());
        readerDto.setLastName(reader.getLastName());
        readerDto.setPatronymic(reader.getPatronymic());
        readerDto.setAddress(reader.getAddress());
        readerDto.setBirthDate(reader.getBirthDate());
        readerDto.setTicketNumber(reader.getTicketNumber());
        return readerDto;
    }

    @Override
    public List<Reader> fromDtos(List<ReaderDto> readerDtos) {
        return readerDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<ReaderDto> toDtos(List<Reader> readers) {
        return readers.stream().map((x) -> toDto(x)).collect(Collectors.toList());
    }
}
