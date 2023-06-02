package com.ddeogip.todo.web.todo.dto;

import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;

import java.time.LocalDateTime;

public class TodoUpdateRequestDto {

    private String title;

    private String content;

    private LocalDateTime limitDate;

    private Long userId;
}
