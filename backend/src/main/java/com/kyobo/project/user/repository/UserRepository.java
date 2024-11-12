package com.kyobo.project.user.repository;

import com.kyobo.project.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByEmail(String email);       // 이메일 중복 확인
    boolean existsByNickname(String nickname); // 닉네임 중복 확인
}
