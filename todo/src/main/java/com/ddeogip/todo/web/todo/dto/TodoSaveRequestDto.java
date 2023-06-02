package com.ddeogip.todo.web.todo.dto;

import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;

import java.time.LocalDateTime;

public class TodoSaveRequestDto {

    private String title;

    private String content;

    private LocalDateTime limitDate;

    private Long userId;

    public Todo toEntity(User user) {

        return new Todo();
    }
}
