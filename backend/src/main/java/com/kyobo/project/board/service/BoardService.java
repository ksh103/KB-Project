package com.kyobo.project.board.service;

import com.kyobo.project.board.domain.Board;
import com.kyobo.project.board.dto.response.BoardFindResponse;
import com.kyobo.project.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
