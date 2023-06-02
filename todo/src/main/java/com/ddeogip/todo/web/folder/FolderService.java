package com.ddeogip.todo.web.folder;

import com.ddeogip.todo.domain.repository.CommentRepository;
import com.ddeogip.todo.domain.repository.FolderRepository;
import com.ddeogip.todo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FolderService {

    private final FolderRepository folderRepository;
    private final UserRepository userRepository;

    public void save( FolderRequestDto requestDto) {

    }

    public void update( FolderRequestDto requestDto) {

    }

    public void delete( Long id) {

    }

    public List<FolderResponseDto> getFolderList( Long user_id) {
        FolderResponseDto folderResponseDto = new FolderResponseDto();
    }
}
