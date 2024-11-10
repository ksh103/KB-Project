import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DelectMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/api/v1/post")
public class PostController {

    //전체 게시글 조회(메인 화면)
    @GetMapping("/all")
    public void getPostAll {

    }

    //특정ID의 게시글 조회
    @GetMapping("/{postId}")
    public void getPost {

    }

    //특정ID의 게시글 삭제
    @DelectMapping("/delect")
    public void delectPost {

    }

}