package com.example.studentmdm.response;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class GenericResponse<T> {

    private T response;

    private Boolean isSuccess;

    private String errorMessage;
}
