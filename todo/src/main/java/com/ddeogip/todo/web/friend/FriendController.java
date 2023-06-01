package com.ddeogip.todo.web.friend;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;

    private void save() {

    }

    private void delete() {

    }

    private List<FriendResponseDto> getFriendList(@PathVariable Long id) {

    }
}
