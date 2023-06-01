package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
