package com.kyobo.project.gonggu.repository;

import com.kyobo.project.gonggu.domain.Board;
import com.kyobo.project.gonggu.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
