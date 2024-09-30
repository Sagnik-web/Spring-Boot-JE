package sb.boot.JE.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sb.boot.JE.Entity.Post;
import sb.boot.JE.Service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    private PostService postService;

    @PostMapping
    public boolean createPost(@RequestBody Post post){
        postService.createPost(post);
        return true;
    }

}
