package com.kyobo.project.board.controller;

import com.kyobo.project.board.dto.response.BoardFindResponse;
import com.kyobo.project.board.service.BoardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "게시판 정보", description = "게시판 정보 API")
@RequestMapping("/api/v1/boards")
public class BoardController {

    private final BoardService boardService;

    @Tag(name = "게시판 정보")
    @Operation(summary = "게시글 조회(단건)", description = "게시글 조회를 한다.")
    @GetMapping("/{boardId}")
    private ResponseEntity<BoardFindResponse> findBoard(@Parameter(description = "게시글 ID", required = true) @PathVariable Long boardId) {
        log.info("findBoard - Call");

        return ResponseEntity.ok(boardService.findBoard(boardId));
    }

}
