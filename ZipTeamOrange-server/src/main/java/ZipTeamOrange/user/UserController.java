package ZipTeamOrange.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    ObjectMapper ob = new ObjectMapper();

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    @CrossOrigin(origins = {"https://arcane-ridge.herokuapp.com/", "http://localhost:8100", "http://localhost:8101", "http://localhost:8102"})
    public @ResponseBody String addNewUser(@RequestBody User user) throws JsonProcessingException {
        userRepository.save(user);
        return ob.writeValueAsString(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUser(){
        //this returns a JSON or XML with users
        return userRepository.findAll();
    }

}
