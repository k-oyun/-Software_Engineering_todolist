package com.ddeogip.todo.web.comment.dto;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;

public class CommentSaveRequestDto {

    private String content;

    private String friendId;

    private String todoId;

    public Comment toEntity(User friend, Todo todo) {
        return new Comment();
    }
}
