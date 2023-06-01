package com.ddeogip.todo.domain.entity;

import jakarta.persistence.Entity;

@Entity
public class Folder {

    private Long id;
    private String title;
    private User user;

    public void update(String title) {
        this.title = title;
    }
}
