package com.yazilimbilimi.springbootmanytomanyrelationship.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {

    private String username;
    private String email;
    private String password;
    private String[] roles;

}
