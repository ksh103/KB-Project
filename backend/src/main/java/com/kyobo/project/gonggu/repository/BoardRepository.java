package com.kyobo.project.gonggu.repository;

import com.kyobo.project.gonggu.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
