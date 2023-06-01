package com.ddeogip.todo.web.user;

import com.ddeogip.todo.web.user.dto.LoginRequestDto;
import com.ddeogip.todo.web.user.dto.UserResponseDto;
import com.ddeogip.todo.web.user.dto.UserSaveRequestDto;
import com.ddeogip.todo.web.user.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public void save(@RequestBody UserSaveRequestDto requestDto) {

    }

    public void delete(@PathVariable Long id) {

    }

    public void update(@RequestBody UserUpdateRequestDto requestDto) {

    }

    public void findPassword(@RequestParam String email) {

    }

    public UserResponseDto getUser(@PathVariable Long id) {

    }

    public void login(@RequestBody LoginRequestDto requestDto) {

    }

    public void logout(@PathVariable Long id) {

    }


}
