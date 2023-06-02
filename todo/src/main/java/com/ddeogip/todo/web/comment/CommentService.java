package com.ddeogip.todo.web.comment;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;
import com.ddeogip.todo.domain.repository.CommentRepository;
import com.ddeogip.todo.domain.repository.TodoRepository;
import com.ddeogip.todo.domain.repository.UserRepository;
import com.ddeogip.todo.web.comment.dto.CommentResponseDto;
import com.ddeogip.todo.web.comment.dto.CommentSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    public void save( CommentSaveRequestDto requestDto) {

        Long userId = 1L;
        User byId = userRepository.findById(userId).orElseThrow();
        Todo byId1 = todoRepository.findById(userId).orElseThrow();
        commentRepository.save(requestDto.toEntity(byId, byId1));
    }

    public void delete( Long id) {

    }

    public List<CommentResponseDto> getCommentList( Long todoId) {

        Long userId = 1L;
        Todo byId1 = todoRepository.findById(userId).orElseThrow();
        List<Comment> byTodo = commentRepository.findByTodo(byId1);
        CommentResponseDto commentResponseDto = new CommentResponseDto(new Comment());
        return byTodo.stream().map(CommentResponseDto::new).toList();
    }
}
