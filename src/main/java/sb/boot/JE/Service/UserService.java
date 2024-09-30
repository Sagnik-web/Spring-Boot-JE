package sb.boot.JE.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sb.boot.JE.Entity.User;
import sb.boot.JE.Repo.UserRepo;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void createUser(User user){
        userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
