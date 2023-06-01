package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Comment;
import com.ddeogip.todo.domain.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByTodo(Todo todo);
}
