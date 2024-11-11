package com.kyobo.project.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDto {

    private String email;
    private String password;
    private String nickname;
    private String category;


}
