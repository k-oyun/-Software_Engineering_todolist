package com.ddeogip.todo.web.stat;

import com.ddeogip.todo.domain.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StatService {

    private final TodoRepository todoRepository;

    public StatResponseDto getStat( Long userId) {

    }
}
