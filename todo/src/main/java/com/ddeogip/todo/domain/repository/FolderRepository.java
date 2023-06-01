package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Folder;
import com.ddeogip.todo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {

    List<Folder> findByUser(User user);
}
