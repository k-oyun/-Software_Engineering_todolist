package com.ddeogip.todo.web.stat;

import com.ddeogip.todo.domain.repository.TodoRepository;
import com.ddeogip.todo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StatService {

    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    public StatResponseDto getStat( Long userId) {
        return new StatResponseDto();
    }
}
