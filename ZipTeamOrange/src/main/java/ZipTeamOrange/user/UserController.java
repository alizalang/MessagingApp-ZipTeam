package ZipTeamOrange.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    @CrossOrigin(origins = {"http://localhost:8100", "http://localhost:8080"})
    public @ResponseBody String addNewuser(@RequestParam String username, @RequestParam String email, @RequestParam String password){
        User user = new User(username, email, password);

        userRepository.save(user);

        return  "saved";
    }

}
