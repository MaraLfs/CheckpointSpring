package com.chekpoint3Spring.checkpoint3Spring.repository;

import com.chekpoint3Spring.checkpoint3Spring.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
