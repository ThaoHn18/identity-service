package com.devteria.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserCreationRequest {
    @Size(min=3, message = "USERNAME_INVALID")
    private String username;
    @Size(min = 8, message = "PASSWORD_INVALID")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;



}
