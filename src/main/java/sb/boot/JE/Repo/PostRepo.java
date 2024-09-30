package sb.boot.JE.Repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import sb.boot.JE.Entity.Post;

public interface PostRepo extends MongoRepository<Post, ObjectId> {
}
