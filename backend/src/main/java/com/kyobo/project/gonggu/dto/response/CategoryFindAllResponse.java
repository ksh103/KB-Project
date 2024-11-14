package com.kyobo.project.gonggu.dto.response;

import com.kyobo.project.gonggu.domain.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class CategoryFindAllResponse {

    private List<CategoryFindResponse> categories;

    private CategoryFindAllResponse(final List<CategoryFindResponse> categories) {
        this.categories = categories;
    }

    public static CategoryFindAllResponse fromEntity(final Page<Category> findCategories) {
        List<CategoryFindResponse> categoryFindResponses = findCategories.stream()
                .map(CategoryFindResponse::fromEntity)
                .collect(Collectors.toList());

        return new CategoryFindAllResponse(categoryFindResponses);
    }
}
