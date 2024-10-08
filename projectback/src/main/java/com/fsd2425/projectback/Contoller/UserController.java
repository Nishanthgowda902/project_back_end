package com.fsd2425.projectback.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fsd2425.projectback.entity.User;
import com.fsd2425.projectback.service.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/api/products")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("Admin/Form")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println("Received User: " + user);
        User savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser);
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/admin/form")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println("Received User: " + user);
        User savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser);
    }

    

    @DeleteMapping("admin/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
