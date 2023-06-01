package com.example.assignment1.user;

public class User {
    private Long id;
    private String name;
    private Grade grade;

    public User(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
