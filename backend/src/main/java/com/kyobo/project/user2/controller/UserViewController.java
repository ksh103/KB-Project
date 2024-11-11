// 회원조회(회원 이력 조회)
// REST API 요청 처리
// 주석 추가
package com.kyobo.project.user.controller;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user/${user_id}")
public class UserViewController {

    private final UserViewController userviewservice;

    @Autowired
    public UserViewController(UserViewController userviewservice) {
        this.userviewservice = userviewservice;
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getMemberById(@PathVariable Long user_id) {
        Optional<User> user = userviewservice.getMemberById(user_id);
        return user.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
