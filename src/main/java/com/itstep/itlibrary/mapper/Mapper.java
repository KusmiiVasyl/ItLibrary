package com.itstep.itlibrary.mapper;

import com.itstep.itlibrary.dto.BookDto;
import com.itstep.itlibrary.entity.Book;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    BookDto toBookDto(Book book);
    Book toBook(BookDto bookDto);
    void mergeBook(BookDto bookDto,@MappingTarget Book book);
}
