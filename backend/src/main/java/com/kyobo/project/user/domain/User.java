package com.kyobo.project.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_email", length = 20, nullable = false, unique = true)
    private String userEmail;

    @Column(name = "user_password", length = 30, nullable = false)
    private String userPassword;

    @Column(name = "user_nickname", length = 10, nullable = false, unique = true)
    private String userNickname;

    @Column(name = "user_category", columnDefinition = "LONGTEXT")
    private String userCategory;

    @Column(name = "del_yn", length = 45, nullable = false)
    private String delYn;

    @Column(name = "reg_dt")
    private LocalDate regDt;

    @Column(name = "ls_ch_dt")
    private LocalDate lsChDt;

}
