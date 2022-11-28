package com.chekpoint3Spring.checkpoint3Spring.controlleurs;

import com.chekpoint3Spring.checkpoint3Spring.dao.User;
import com.chekpoint3Spring.checkpoint3Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/users")
    public List<User> list() {
        return repo.findAll();
    }

    @GetMapping("/users/{id}")
    public User UsersDetails(@PathVariable Integer id) {
        return repo.findById(id).get();

    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        user.setId(id);
        return repo.save(user);
    }

    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable Integer id) {
        repo.deleteById(id);
        return true;
    }

}
