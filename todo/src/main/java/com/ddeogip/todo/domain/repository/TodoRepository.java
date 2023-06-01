package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Folder;
import com.ddeogip.todo.domain.entity.Todo;
import com.ddeogip.todo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUser(User user);

    List<Todo> findByFolder(Folder folder);
}
