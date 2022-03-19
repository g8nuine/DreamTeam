package com.example.DU;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDto> getBooks(String bookAuthor) {return null;}

    @Transactional
    public BookDto getBook(Long BookId) {
        Optional<BookEntity> byId = bookRepository.findById(BookId);

        if(byId.isPresent()) {
            return mapToBookDto(byId.get());
        }
        return null;
    }

    private static BookDto mapToBookDto(BookEntity bookEntity) {
        BookDto bookDto = new BookDto();

        bookDto.setAuthor(bookEntity.getAuthor());
        bookDto.setTitle(bookEntity.getTitle());
        return bookDto;
    }
}
