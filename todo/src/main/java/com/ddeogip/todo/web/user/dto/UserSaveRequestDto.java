package com.ddeogip.todo.web.user.dto;

import com.ddeogip.todo.domain.entity.User;

public class UserSaveRequestDto {

    private String nickname;
    private String password;
    private String email;

    public User toEntity() {
        return new User();
    }
}
