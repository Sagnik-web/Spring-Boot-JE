package sb.boot.JE.Repo;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import sb.boot.JE.Entity.User;

@Component
public interface UserRepo extends MongoRepository<User,ObjectId> {


}
