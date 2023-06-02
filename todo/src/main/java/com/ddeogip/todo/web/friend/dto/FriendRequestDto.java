package com.ddeogip.todo.web.friend.dto;

import com.ddeogip.todo.domain.entity.Friend;
import com.ddeogip.todo.domain.entity.User;

public class FriendRequestDto {

    private Long userId;
    private Long friendId;

    public Friend toEntity(User user, User friend) {
        return new Friend();
    }
}
