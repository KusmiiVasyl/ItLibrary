package com.itstep.itlibrary.service;

import com.itstep.itlibrary.entity.Book;
import com.itstep.itlibrary.exception.EntityNotFoundException;
import com.itstep.itlibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book get(Long id) {
        return bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void create(Book book) {
        bookRepository.save(book);
    }

    public void update(Long id, Book book) {
        Book existingBook = bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        existingBook.setTitle(book.getTitle());
        bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}

    /* Можна так робити dependency injection
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    з reflection api @Autowired privateBookRepository bookRepository;
     */