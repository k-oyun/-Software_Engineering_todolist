package com.ddeogip.todo.web.todo;

import com.ddeogip.todo.web.todo.dto.TodoResponseDto;
import com.ddeogip.todo.web.todo.dto.TodoReqeustDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    public void save(@RequestBody TodoReqeustDto reqeustDto) {

    }

    public void update(@RequestBody TodoReqeustDto reqeustDto) {

    }

    public void delete(@PathVariable Long id) {

    }

    public void completeTodo(@PathVariable Long id) {

    }

    public TodoResponseDto getTodo(@PathVariable Long id) {

    }

    public List<TodoResponseDto> getTodoList(@PathVariable Long userId) {

    }
}
