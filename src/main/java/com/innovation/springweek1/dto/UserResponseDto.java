package com.innovation.springweek1.dto;

import com.innovation.springweek1.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private long id;
    private String name;
    private String email;
    private String pw;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.pw = user.getPw();
    }
}
