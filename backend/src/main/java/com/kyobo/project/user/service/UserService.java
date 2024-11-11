package com.kyobo.project.user.service;

import com.kyobo.project.user.dto.SignUpRequestDto;
import com.kyobo.project.user.domain.User;
import com.kyobo.project.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String signUpUser(SignUpRequestDto request){
        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        // 새로운 사용자 생성 및 저장
        User user = new User();
        user.setUserEmail(request.getEmail());
        user.setUserPassword(encodedPassword);
        user.setUserNickname(request.getNickname());
        user.setUserCategory(request.getCategory());
        user.setDelYn("N"); // 기본값으로 'N' 설정
        user.setRegDt(LocalDate.now());
        user.setLsChDt(LocalDate.now());

        userRepository.save(user);
        return "회원가입이 성공적으로 완료되었습니다.";
    }
}
