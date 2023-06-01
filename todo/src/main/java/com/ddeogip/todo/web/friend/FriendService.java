package com.ddeogip.todo.web.friend;

import com.ddeogip.todo.domain.repository.FriendRepository;
import com.ddeogip.todo.web.friend.dto.FriendRequestDto;
import com.ddeogip.todo.web.friend.dto.FriendResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    private void save( FriendRequestDto requestDto) {

    }

    private void delete( FriendRequestDto requestDto) {

    }

    private List<FriendResponseDto> getFriendList(Long id) {

    }
}
