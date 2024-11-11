import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController  // REST API 컨트롤러 지정
@RequestMapping("/auth")  // 기본 요청 경로 설정
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;  // 스프링 인증 매니저

    @Autowired
    private JwtUtil jwtUtil;  // JWT 유틸리티 클래스

    @PostMapping("/login")  // POST 요청을 받는 엔드포인트 설정
    public String login(@RequestBody AuthRequest authRequest) {
        // 사용자 인증 정보 객체 생성
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        // JWT 토큰 생성 및 반환
        String token = jwtUtil.generateToken(authRequest.getUsername());
        return token;
    }
}

// 로그인 요청을 담는 DTO 클래스
class AuthRequest {
    private String username;
    private String password;

    // Getter 및 Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
