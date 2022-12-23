package com.itstep.itlibrary.service;

import com.itstep.itlibrary.dto.BookDto;
import com.itstep.itlibrary.entity.Book;
import com.itstep.itlibrary.exception.EntityNotFoundException;
import com.itstep.itlibrary.mapper.Mapper;
import com.itstep.itlibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final Mapper mapper;

    public List<BookDto> getAll() {
        return bookRepository.findAll().stream().map(mapper::toBookDto).toList();
    }

    public BookDto get(Long id) {
        return bookRepository.findById(id).map(mapper::toBookDto).orElseThrow(EntityNotFoundException::new);
    }

    public void create(BookDto bookDto) {
        bookRepository.save(mapper.toBook(bookDto));
    }

    public void update(Long id, BookDto bookDto) {
        Book book = bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        mapper.mergeBook(bookDto, book);
        bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}

