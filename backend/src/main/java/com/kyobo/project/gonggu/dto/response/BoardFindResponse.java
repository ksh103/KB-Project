package com.kyobo.project.gonggu.dto.response;

import com.kyobo.project.gonggu.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardFindResponse {

    private Long boardId;
    private String boardTitle;

    public static BoardFindResponse fromEntity(final Board board) {
        return BoardFindResponse.builder()
                .boardId(board.getBoardId())
                .boardTitle(board.getBoardTitle())
                .build();
    }
}