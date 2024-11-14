package com.kyobo.project.gonggu.dto.response;

import com.kyobo.project.gonggu.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CategoryFindResponse {

    private Long categoryId;
    private String categoryCode;
    private String categoryName;

    public static CategoryFindResponse fromEntity(final Category category) {
        return CategoryFindResponse.builder()
                                    .categoryId(category.getCategoryId())
                                    .categoryCode(category.getCategoryCode())
                                    .categoryName(category.getCategoryName())
                                    .build();
    }
}
