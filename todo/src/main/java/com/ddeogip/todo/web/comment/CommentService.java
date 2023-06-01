package com.ddeogip.todo.web.comment;

import com.ddeogip.todo.domain.repository.CommentRepository;
import com.ddeogip.todo.web.comment.dto.CommentResponseDto;
import com.ddeogip.todo.web.comment.dto.CommentSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void save( CommentSaveRequestDto requestDto) {

    }

    public void delete( Long id) {

    }

    public List<CommentResponseDto> getCommentList( Long todoId) {

    }
}
