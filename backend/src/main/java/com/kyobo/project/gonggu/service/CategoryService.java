package com.kyobo.project.gonggu.service;

import com.kyobo.project.gonggu.domain.Category;
import com.kyobo.project.gonggu.dto.response.CategoryFindAllResponse;
import com.kyobo.project.gonggu.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public CategoryFindAllResponse findAllCategory(final Pageable pageable) {
        Page<Category> findCategories = categoryRepository.findAll(pageable);

        return CategoryFindAllResponse.fromEntity(findCategories);
    }
}
