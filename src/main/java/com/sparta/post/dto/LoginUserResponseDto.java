package com.sparta.post.dto;

import lombok.Getter;

@Getter
public class LoginUserResponseDto {
    private Long id;
    private String msg;
    private Integer statusCode;

    public LoginUserResponseDto(String msg, Integer statusCode) {
        this.msg = msg;
        this.statusCode = statusCode;
    }
}
