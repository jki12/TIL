package com.example.assignment1.user;

import org.springframework.lang.Nullable;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepo implements IUserRepo {

    private static Map<Long, User> store = new HashMap<>();

    @Override
    public boolean save(User user) {
        if (store.containsKey(user.getId())) return false;

        store.put(user.getId(), user);

        return true;
    }

    @Override
    public @Nullable User findById(Long userId) {
        return store.get(userId);
    }
}
