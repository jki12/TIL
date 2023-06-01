package com.example.assignment1.user;

import org.springframework.lang.NonNull;

public interface IUserRepo {

    boolean save(@NonNull User user);

    User findById(Long userId);
}
