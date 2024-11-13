package com.kyobo.project.board.controller;
import com.kyobo.project.board.domain.Post;
import com.kyobo.project.board.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Post>> getPostAll() {

        log.info("getPostAll 시작!");

        List<Post> postListShow = postService.findPostsAll();

        if (postListShow != null) {
            return new ResponseEntity<>(postListShow, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(postListShow, HttpStatus.BAD_REQUEST);
        }

    }

    //특정ID의 게시글 조회
    @GetMapping("/{postId}")
    public ResponseEntity<Optional<Post>> getPost(@PathVariable int postId) {

        log.info("getPost 시작!");

        Optional<Post> postShow = postService.findPost(postId);

        if (postShow != null) {
            return new ResponseEntity<>(postShow, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(postShow, HttpStatus.BAD_REQUEST);
        }

    }

    //특정ID의 게시글 삭제
    @PostMapping("/delect/{postID}")
    public void delectPost(@PathVariable int postId) {

        log.info("delectPost 시작!");

        postService.deleteByPost(postId);

    }

}