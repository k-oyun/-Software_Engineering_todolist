package com.ddeogip.todo.web.friend;

import com.ddeogip.todo.domain.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;
}
