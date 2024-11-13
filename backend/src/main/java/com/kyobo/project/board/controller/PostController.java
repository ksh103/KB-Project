package com.kyobo.project.board.controller;
import com.kyobo.project.board.domain.Post;
import com.kyobo.project.board.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    PostService postService;

    //전체 게시글 조회(메인 화면)
    @GetMapping("/all")
    public List<Post> getPostAll() {

        log.info("getPostAll 시작!");
        List<Post> postList = postService.findPostsAll();

        return postList;

    }

    //특정ID의 게시글 조회
    @GetMapping("/{postId}")
    public Optional<Post> getPost(@PathVariable int postId) {

        log.info("getPost 시작!");
        Optional<Post> post = postService.findPost(postId);

        return post;

    }

    //특정ID의 게시글 삭제
    @PostMapping("/delect")
    public void delectPost() {

        log.info("delectPost 시작!");

    }

}