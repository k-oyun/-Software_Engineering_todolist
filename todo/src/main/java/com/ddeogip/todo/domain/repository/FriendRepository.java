package com.ddeogip.todo.domain.repository;

import com.ddeogip.todo.domain.entity.Friend;
import com.ddeogip.todo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend, Long> {

    List<Friend> findByUser(User user);
}
