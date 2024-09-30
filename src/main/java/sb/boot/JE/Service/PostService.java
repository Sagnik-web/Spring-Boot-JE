package sb.boot.JE.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sb.boot.JE.Entity.Post;
import sb.boot.JE.Pojo.PostPojo;
import sb.boot.JE.Repo.PostRepo;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostService {

    @Autowired
    private PostRepo postRepo;

//    @Autowired
//    private PostPojo postPojo;

    public void createPost(Post post){

        postRepo.save(post);
    }

    public List<PostPojo> allPost(){
        return postRepo.findAll()
                .stream()
                .map(el -> new PostPojo(el.getTitle()))
                .collect(Collectors.toList());
    }
}
