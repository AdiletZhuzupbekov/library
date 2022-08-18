package kg.megacom.library.service.impl;

import kg.megacom.library.domains.BookRepo;
import kg.megacom.library.domains.ReaderRepo;
import kg.megacom.library.mappers.BookMapper;
import kg.megacom.library.mappers.ReaderMapper;
import kg.megacom.library.models.Book;
import kg.megacom.library.models.Reader;
import kg.megacom.library.models.dto.BookDto;
import kg.megacom.library.models.dto.ReaderDto;
import kg.megacom.library.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {
    ReaderMapper readerMapper;
    private final BookRepo bookRepo;
    private final ReaderRepo readerRepo;

    public BookServiceImpl(BookRepo bookRepo, ReaderRepo readerRepo) {
        this.bookRepo = bookRepo;
        this.readerRepo = readerRepo;
    }

    @Override
    public Object findMaxPrice() {
        List<Reader> readers = readerRepo.findAll();


        // ALL MATCH
//        return readers.stream().allMatch(x ->
//                Objects.equals(x.getTicketNumber(), null));
        // ANY MATCH
//        return readers.stream().anyMatch(x ->
//                Objects.equals(x.getName(), "adilet"));
        //LONG COUNT
//        long readerDto = readers
//                .stream()
//                .filter(x->x.getName().equals("adilet"))
//                .count();
//        return readerDto;
        // distinct
//        return readers.stream().distinct();
        //MAX
//        return readers.stream().max(Comparator.comparingInt(Reader::getAge));
        //MIN
//        return readers.stream().min(Comparator.comparingInt(Reader::getAge));
        //FIND ANY
//        return readers.stream().filter(x->x.getName().equals("dolon")).findAny();
        //FIND FIRST
        return readers.stream().filter(x->x.getName().equals("dolon")).findFirst();
    }

}
