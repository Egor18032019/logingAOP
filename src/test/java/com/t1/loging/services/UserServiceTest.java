package com.t1.loging.services;

import com.t1.loging.store.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
public class UserServiceTest {
    @Autowired
    UserService services;

    @Test
    public void createUser() {

        String username = "test";
        String email = "test@test.com";
        User user = services.createUser(username, email);

        Assertions.assertEquals(user.getName(), username);
        Assertions.assertEquals(user.getEmail(), email);

        services.deleteById(user.getId());
    }


}
