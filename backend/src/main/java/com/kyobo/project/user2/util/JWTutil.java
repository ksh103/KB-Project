import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtUtil {

    private final String SECRET_KEY = "your_secret_key";  // 비밀키 설정

    // JWT 토큰 생성
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)  // 토큰 제목으로 사용자 이름 설정
                .setIssuedAt(new Date(System.currentTimeMillis()))  // 현재 시간 설정
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  // 만료 시간 설정 (10시간)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)  // 서명 알고리즘 및 비밀키 설정
                .compact();  // 토큰 생성
    }

    // JWT 토큰에서 사용자 이름 추출
    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }

    // JWT 토큰 유효성 검증
    public Boolean isTokenValid(String token, String username) {
        final String extractedUsername = extractUsername(token);  // 토큰에서 사용자 이름 추출
        return (extractedUsername.equals(username) && !isTokenExpired(token));  // 유효성 검증
    }

    // JWT 토큰의 만료 여부 확인
    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // JWT 토큰의 만료 날짜 추출
    private Date extractExpiration(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getExpiration();
    }
}
