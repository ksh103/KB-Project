package com.kyobo.project.board.domain;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Post {

    // 현정 수정 필요!
    @Id
    @Column(name = "gonggu_id", nullable = false, unique = true)
    private int gongguId;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "user_email", length = 20, nullable = false)
    private String userEmail;

    @Column(name = "gonggu_contents", nullable = false)
    private String gongguContects;

    @Column(name = "gonggu_dead_line", nullable = false)
    private LocalDate gongguDeadLine;

    @Column(name = "gonggu_temperature", length = 10, nullable = false, columnDefinition = "0")
    private String gongguTemperature;

    @Column(name = "dead_line_yn", length = 1, nullable = false, columnDefinition = "N")
    private String deadLineYn;

    @Column(name = "target_participants", nullable = false, columnDefinition = "0")
    private int targetParticipants;

    @Column(name = "current_participants", nullable = false, columnDefinition = "0")
    private int currentParticipants;

    @Column(name = "del_yn", length = 1, nullable = false, columnDefinition = "N")
    private String delYn;

    @Column(name = "reg_dt", nullable = false)
    private LocalDate regDt;

    @Column(name = "ls_ch_dt", nullable = false)
    private LocalDate lsChDt;

}
