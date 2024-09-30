package sb.boot.JE.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import sb.boot.JE.Entity.Post;
import sb.boot.JE.Repo.PostRepo;

@Component
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public void createPost(Post post){

        postRepo.save(post);
    }
}
