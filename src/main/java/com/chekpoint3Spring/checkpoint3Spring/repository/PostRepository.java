package com.chekpoint3Spring.checkpoint3Spring.repository;

import com.chekpoint3Spring.checkpoint3Spring.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
