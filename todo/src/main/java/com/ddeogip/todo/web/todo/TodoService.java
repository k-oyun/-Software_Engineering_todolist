package com.ddeogip.todo.web.todo;

import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;
import com.ddeogip.todo.domain.repository.TodoRepository;
import com.ddeogip.todo.domain.repository.UserRepository;
import com.ddeogip.todo.web.todo.dto.TodoSaveRequestDto;
import com.ddeogip.todo.web.todo.dto.TodoResponseDto;
import com.ddeogip.todo.web.todo.dto.TodoUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    public void save( TodoSaveRequestDto reqeustDto) {
        User byId = userRepository.findById(reqeustDto.getUserId()).orElseThrow();
        todoRepository.save(reqeustDto.toEntity(byId));
    }

    public void update( TodoUpdateRequestDto reqeustDto) {

    }

    public void delete( Long id) {

    }

    public void completeTodo( Long id) {

    }

    public TodoResponseDto getTodo( Long id) {

        Todo byId = todoRepository.findById(id).orElseThrow();
        return new TodoResponseDto(byId);
    }

    public List<TodoResponseDto> getTodoList( Long userId) {

        User byId = userRepository.findById(userId).orElseThrow();
        List<Todo> byUser = todoRepository.findByUser(byId);
        return byUser.stream().map(TodoResponseDto::new).toList();
    }
}
