package com.kyobo.project.user.controller;

import com.kyobo.project.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.kyobo.project.user.dto.SignUpRequestDto;
import com.kyobo.project.user.domain.User;
import com.kyobo.project.user.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/join")
    public ResponseEntity<String> signUpUser(@Valid @RequestBody SignUpRequestDto request) {
        String responseMessage = userService.signUpUser(request);
        return ResponseEntity.ok(responseMessage);
    }



}
