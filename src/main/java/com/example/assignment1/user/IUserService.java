package com.example.assignment1.user;

import org.springframework.lang.NonNull;

public interface IUserService {

    boolean join(@NonNull User user);

    User findUser(Long memberId);
}
