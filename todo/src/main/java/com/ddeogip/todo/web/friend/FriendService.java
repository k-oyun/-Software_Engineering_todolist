package com.ddeogip.todo.web.friend;

import com.ddeogip.todo.domain.entity.Friend;
import com.ddeogip.todo.domain.repository.FriendRepository;
import com.ddeogip.todo.domain.repository.UserRepository;
import com.ddeogip.todo.web.friend.dto.FriendRequestDto;
import com.ddeogip.todo.web.friend.dto.FriendResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;
    private final UserRepository userRepository;

    public void save( FriendRequestDto requestDto) {

    }

    public void delete(Long id) {

    }

    public List<FriendResponseDto> getFriendList(Long id) {
        FriendResponseDto friendResponseDto = new FriendResponseDto();
    }
}
