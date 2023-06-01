package com.ddeogip.todo.web.folder;

import com.ddeogip.todo.domain.repository.CommentRepository;
import com.ddeogip.todo.domain.repository.FolderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FolderService {

    private final FolderRepository folderRepository;

    private void save( FolderRequestDto requestDto) {

    }

    private void update( FolderRequestDto requestDto) {

    }

    private void delete( Long id) {

    }

    private List<FolderResponseDto> getFolderList( Long user_id) {

    }
}
