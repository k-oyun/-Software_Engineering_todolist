package com.ddeogip.todo.web.user;

import com.ddeogip.todo.domain.repository.UserRepository;
import com.ddeogip.todo.web.user.dto.LoginRequestDto;
import com.ddeogip.todo.web.user.dto.UserResponseDto;
import com.ddeogip.todo.web.user.dto.UserSaveRequestDto;
import com.ddeogip.todo.web.user.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(UserSaveRequestDto requestDto) {

    }

    public void delete(Long id) {

    }

    public void update(UserUpdateRequestDto requestDto) {

    }

    public void findPassword(String email) {

    }

    public UserResponseDto getUser(Long id) {

    }

    public void login(LoginRequestDto requestDto) {

    }

    public void logout(Long id) {

    }
}
