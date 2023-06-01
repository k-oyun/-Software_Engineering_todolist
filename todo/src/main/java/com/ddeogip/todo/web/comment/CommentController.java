package com.ddeogip.todo.web.comment;

import com.ddeogip.todo.web.comment.dto.CommentResponseDto;
import com.ddeogip.todo.web.comment.dto.CommentSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    public void save(@RequestBody CommentSaveRequestDto requestDto) {

    }

    public void delete(@PathVariable Long id) {

    }

    public List<CommentResponseDto> getCommentList(@PathVariable Long todoId) {

    }
}
