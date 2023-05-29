package com.ddeogip.todo.web.todo;

import com.ddeogip.todo.domain.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;
}
