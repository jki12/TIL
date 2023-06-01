package com.example.assignment1.user;

public class UserServiceImpl implements IUserService {

    private IUserRepo repo; // = new MemoryUserRepo();

    public UserServiceImpl(IUserRepo repo) { // remove dip.
        this.repo = repo;
    }

    @Override
    public boolean join(User user) {
        return repo.save(user);
    }

    @Override
    public User findUser(Long memberId) {
        return repo.findById(memberId);
    }
}
