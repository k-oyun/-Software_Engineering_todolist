package com.ddeogip.todo.web.friend;

import com.ddeogip.todo.web.friend.dto.FriendRequestDto;
import com.ddeogip.todo.web.friend.dto.FriendResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;

    public void save(@RequestBody FriendRequestDto requestDto) {

    }

    public void delete(@PathVariable Long id) {

    }

    public List<FriendResponseDto> getFriendList(@PathVariable Long id) {

    }
}
