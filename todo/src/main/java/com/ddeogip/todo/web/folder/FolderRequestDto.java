package com.ddeogip.todo.web.folder;

import com.ddeogip.todo.domain.entity.Folder;
import com.ddeogip.todo.domain.entity.User;

public class FolderRequestDto {

    private String title;

    private Long userId;

    public Folder toEntity(User user) {
        return new Folder();
    }
}
