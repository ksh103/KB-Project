package com.kyobo.project.gonggu.controller;

import com.kyobo.project.gonggu.dto.response.CategoryFindAllResponse;
import com.kyobo.project.gonggu.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "카테고리 정보", description = "카테고리 API")
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Tag(name = "카테고리 정보")
    @Operation(summary = "카테고리 전체 조회", description = "카테고리 전체 조회한다.")
    @GetMapping("")
    private ResponseEntity<CategoryFindAllResponse> findAllCategories(@PageableDefault(size = 10) @SortDefault(sort = "categoryId", direction = Sort.Direction.DESC) Pageable pageable) {
        log.info("findAllCategories - Call");

        return ResponseEntity.ok().body(categoryService.findAllCategory(pageable));
    }
}
