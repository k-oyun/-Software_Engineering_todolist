package com.ddeogip.todo.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
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

    @Builder
    public Comment(String content, User friend) {
        this.content = content;
        this.friend = friend;
    }
}
