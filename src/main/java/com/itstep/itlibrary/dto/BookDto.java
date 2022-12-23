package com.itstep.itlibrary.dto;

import com.itstep.itlibrary.entity.Book;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Data
public class BookDto {
    private Long id;
    private String title;
    private LocalDate publishedDate;
    private List<AuthorInfoDto> authors;
}
