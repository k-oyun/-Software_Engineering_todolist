package com.ddeogip.todo.web.folder;

import com.ddeogip.todo.web.comment.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FolderController {
    private final FolderService folderService;


}
