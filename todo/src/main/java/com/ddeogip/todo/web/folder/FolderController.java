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

    private void save(@RequestBody FolderRequestDto requestDto) {

    }

    private void update(@RequestBody FolderRequestDto requestDto) {

    }

    private void delete(@PathVariable Long id) {

    }

    private List<FolderResponseDto> getFolderList(@PathVariable Long user_id) {

    }
}
