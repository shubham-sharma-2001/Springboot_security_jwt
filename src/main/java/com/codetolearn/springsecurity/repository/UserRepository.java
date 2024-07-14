package com.codetolearn.springsecurity.repository;

import com.codetolearn.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
