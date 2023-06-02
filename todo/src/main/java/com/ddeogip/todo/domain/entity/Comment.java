package com.ddeogip.todo.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "friend_id")
    private User friend;

    private Todo todo;


    public Comment(String content, User friend, Todo todo) {
        this.content = content;
        this.friend = friend;
        this.todo = todo;
    }
}
