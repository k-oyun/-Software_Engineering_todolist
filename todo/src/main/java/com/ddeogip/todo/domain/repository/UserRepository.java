package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
