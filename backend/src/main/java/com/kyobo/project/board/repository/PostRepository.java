package com.kyobo.project.board.repository;

import com.kyobo.project.board.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    List<Post> findAll();

    Optional<Post> findByGongguId(int gongguId);

    Optional<Post> delectBygongguId(int gongguId);

}
