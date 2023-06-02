package com.ddeogip.todo.web.folder;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FolderController {

    private final FolderService folderService;

    public void save(@RequestBody FolderRequestDto requestDto) {

    }

    public void update(@RequestBody FolderRequestDto requestDto) {

    }

    public void delete(@PathVariable Long id) {

    }

    public List<FolderResponseDto> getFolderList(@PathVariable Long user_id) {

    }
}
