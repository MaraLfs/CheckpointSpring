package com.chekpoint3Spring.checkpoint3Spring.controlleurs;

import com.chekpoint3Spring.checkpoint3Spring.dao.Comment;
import com.chekpoint3Spring.checkpoint3Spring.dao.Post;
import com.chekpoint3Spring.checkpoint3Spring.repository.CommentRepository;
import com.chekpoint3Spring.checkpoint3Spring.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private CommentRepository comRepo;

    @GetMapping("/posts")
    public List<Post> list() {
        return postRepo.findAll();
    }

        @PostMapping("/comments")
        public Comment postComment(@RequestBody Comment comment) {

            return comRepo.save(comment);
        }
}
