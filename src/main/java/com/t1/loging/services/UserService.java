package com.t1.loging.services;

import com.t1.loging.annotation.LoggingMethodInService;
import com.t1.loging.model.UserRequest;
import com.t1.loging.store.User;
import com.t1.loging.store.repositories.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserService implements UserServiceCommon {
    UserRepository userRepo;

    @Override
    @LoggingMethodInService
    public User createUser(UserRequest request) {
        return userRepo.save(new User(request.getName(), request.getEmail(), new ArrayList<>()));
    }
    @LoggingMethodInService
    public User createUser(String username,String email) {
        return userRepo.save(new User(username, email, new ArrayList<>()));
    }

    @Override
    public User getUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
