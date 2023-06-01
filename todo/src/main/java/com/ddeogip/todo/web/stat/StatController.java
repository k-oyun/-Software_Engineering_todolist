package com.ddeogip.todo.web.stat;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StatController {

    private final StatService statService;

    public StatResponseDto getStat(@PathVariable Long userId) {

    }
}
