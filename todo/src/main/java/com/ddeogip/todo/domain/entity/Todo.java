package com.ddeogip.todo.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;
    private LocalDateTime limitDate;
    private Boolean complete;
    private LocalDateTime completeDate;

    @ManyToOne
    private Folder folder;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Todo(String title, String content, LocalDateTime limitDate, LocalDateTime completeDate, User user) {
        this.title = title;
        this.content = content;
        this.limitDate = limitDate;
        this.complete = false;
        this.completeDate = completeDate;
        this.user = user;
    }

    public void update(String title, String content, LocalDateTime limitDate) {
        this.title = title;
        this.content = content;
        this.limitDate = limitDate;
    }
}
