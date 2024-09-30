package sb.boot.JE.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sb.boot.JE.Entity.User;
import sb.boot.JE.Service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public Boolean createUser(@RequestBody User user){
        userService.createUser(user);
        return true;
    }

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}
