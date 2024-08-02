package com.t1.loging.store.repositories;

import com.t1.loging.store.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String userName);

}
