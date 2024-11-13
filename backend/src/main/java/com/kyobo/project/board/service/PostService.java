package com.kyobo.project.board.service;

import com.kyobo.project.board.domain.Post;
import com.kyobo.project.board.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostService {

    PostRepository postRepository;

    public List<Post> findPostsAll() {
        return postRepository.findAll();
    }

    public Optional<Post> findPost(int gongguId) {
        return postRepository.findById(gongguId);
    }

}