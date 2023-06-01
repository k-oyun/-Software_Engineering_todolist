package com.ddeogip.todo.web.todo;

import com.ddeogip.todo.domain.repository.TodoRepository;
import com.ddeogip.todo.web.todo.dto.TodoReqeustDto;
import com.ddeogip.todo.web.todo.dto.TodoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public void save( TodoReqeustDto reqeustDto) {

    }

    public void update( TodoReqeustDto reqeustDto) {

    }

    public void delete( Long id) {

    }

    public void completeTodo( Long id) {

    }

    public TodoResponseDto getTodo( Long id) {

    }

    public List<TodoResponseDto> getTodoList( Long userId) {

    }
}
