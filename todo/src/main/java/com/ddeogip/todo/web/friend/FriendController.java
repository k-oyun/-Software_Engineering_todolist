package com.ddeogip.todo.web.friend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;
}
