package com.t1.loging.controllers;

import com.t1.loging.model.UserRequest;
import com.t1.loging.services.UserServiceCommon;
import com.t1.loging.store.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class UserControllers {
    UserServiceCommon userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(id));

    }

    @PostMapping()
    public ResponseEntity<Long> greatTask(@RequestBody UserRequest request) {
        Long id = userService.createUser(request).getId();
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }
}
