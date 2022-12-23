package com.itstep.itlibrary.dto;

import lombok.Data;
import java.util.List;


@Data
public class AuthorInfoDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
