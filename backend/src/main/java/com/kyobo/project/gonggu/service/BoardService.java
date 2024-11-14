package com.kyobo.project.gonggu.service;

import com.kyobo.project.gonggu.domain.Board;
import com.kyobo.project.gonggu.dto.response.BoardFindResponse;
import com.kyobo.project.gonggu.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardFindResponse findBoard(final Long boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new RuntimeException("찾는 게시판 정보가 없습니다."));

        return BoardFindResponse.fromEntity(board);
    }

}
