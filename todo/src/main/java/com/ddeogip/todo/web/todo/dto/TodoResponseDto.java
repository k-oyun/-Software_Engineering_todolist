package com.ddeogip.todo.web.todo.dto;

import java.time.LocalDateTime;

public class TodoResponseDto {

    private Long id;

    private String title;

    private String content;

    private LocalDateTime limitDate;

    private Boolean complete;

    private LocalDateTime completeDate;

}
