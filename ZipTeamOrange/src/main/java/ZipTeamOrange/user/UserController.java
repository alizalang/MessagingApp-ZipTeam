package ZipTeamOrange.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    @CrossOrigin(origins = {"http://localhost:8102"})
    public @ResponseBody String addNewUser(@RequestBody User user){
        userRepository.save(user);
        return  "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUser(){
        //this returns a JSON or XML with users
        return userRepository.findAll();
    }

}
