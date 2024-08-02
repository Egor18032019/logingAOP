package com.t1.loging.services;

import com.t1.loging.model.UserRequest;
import com.t1.loging.store.User;

public interface UserServiceCommon {
    User createUser(UserRequest request);
    User createUser(String username,String email);

    User getUser(Long id);

    void deleteById(Long id);
}
