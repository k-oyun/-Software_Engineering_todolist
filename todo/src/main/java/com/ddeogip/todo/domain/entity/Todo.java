package com.ddeogip.todo.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDateTime limitDate;
    private Boolean complete;
    private LocalDateTime completeDate;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Builder
    public Todo(String title, LocalDateTime limitDate, LocalDateTime completeDate, User userId) {
        this.title = title;
        this.limitDate = limitDate;
        this.complete = false;
        this.completeDate = completeDate;
        this.userId = userId;
    }
}
