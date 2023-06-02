package com.ddeogip.todo.web.todo;

import com.ddeogip.todo.web.todo.dto.TodoResponseDto;
import com.ddeogip.todo.web.todo.dto.TodoSaveRequestDto;
import com.ddeogip.todo.web.todo.dto.TodoUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    public void save(@RequestBody TodoSaveRequestDto reqeustDto) {

        todoService.save(reqeustDto);
    }

    public void update(@RequestBody TodoUpdateRequestDto reqeustDto) {

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
