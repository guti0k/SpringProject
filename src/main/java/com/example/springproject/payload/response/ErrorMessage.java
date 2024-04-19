package com.example.springproject.payload.response;


import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    private int statusCode;

    private String message;
}
