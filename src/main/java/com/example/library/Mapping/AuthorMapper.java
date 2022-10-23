package com.example.library.Mapping;


import com.example.library.Dto.Response.Author.AuthorCreateUpdateDto;
import com.example.library.Dto.Response.Author.AuthorDto;
import com.example.library.Entity.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorDto authorToAuthorDto(Author author);

    Author authorCreateUpdateDtoToAuthor(AuthorCreateUpdateDto author);
}
