import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/api/v1/post")
public class PostController {

    @GetMapping("/all")
    public void getPostAll {

    }
}