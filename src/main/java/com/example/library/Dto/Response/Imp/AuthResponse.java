package com.example.library.Dto.Response.Imp;

import com.example.library.Dto.Response.Response;
import lombok.Data;

@Data
public class AuthResponse implements Response {

    private Long id;

    private String token;
}
