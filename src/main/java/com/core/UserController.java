package com.core;

import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/")
    public ResponseEntity< UserModel> save(){
        return ResponseEntity.ok(userService.save("Zeynep Uygun","zynpzynp.uygun@gmail.com","1234"));
    }
    @GetMapping("/list")
    public ResponseEntity<List<UserModel>> get(){

        System.out.printf(String.valueOf(userService.getAllUsers().size()));
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
