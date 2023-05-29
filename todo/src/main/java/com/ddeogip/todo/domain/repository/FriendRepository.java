package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {
}
