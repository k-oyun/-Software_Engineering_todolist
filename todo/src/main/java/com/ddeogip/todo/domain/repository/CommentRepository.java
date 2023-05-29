package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
