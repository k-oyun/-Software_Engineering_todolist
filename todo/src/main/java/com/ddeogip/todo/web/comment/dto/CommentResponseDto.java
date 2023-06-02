package com.ddeogip.todo.web.comment.dto;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Todo;

public class CommentResponseDto {

    private Long id;

    private String content;

    private String nickname;

    public CommentResponseDto(Comment comment) {
    }
}
