package com.ddeogip.todo.web.folder;

import com.ddeogip.todo.domain.repository.CommentRepository;
import com.ddeogip.todo.domain.repository.FolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FolderService {

    private final FolderRepository folderRepository;
}
