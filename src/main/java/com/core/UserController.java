package com.core;

import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody UserModel user) {
        if (user == null) {
            // Hata işleme kodu veya uygun yanıt döndürme
            return ResponseEntity.badRequest().body("Geçersiz istek.");
        }
        UserModel userModel = userService.save(user.getFullname(), user.getEmail(), user.getPassword());
        return ResponseEntity.ok(userModel);
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> get() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/get-by-email")
    public ResponseEntity<UserModel> getbyEamil(@RequestBody String email) {
        return ResponseEntity.ok(userService.getByEmail(email));
    }

    @GetMapping("/get-users-by-email")
    public ResponseEntity<List<UserModel>> getUsersByEmail(@RequestBody String email) {
        return ResponseEntity.ok(userService.getUsersByEmail(email));
    }
}
