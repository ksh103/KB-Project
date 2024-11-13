package com.kyobo.project.board.controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    //전체 게시글 조회(메인 화면)
    @GetMapping("/all")
    public void getPostAll() {

    }

    //특정ID의 게시글 조회
    @GetMapping("/{postId}")
    public void getPost() {

    }

    //특정ID의 게시글 삭제
    @PostMapping("/delect")
    public void delectPost() {

    }

}