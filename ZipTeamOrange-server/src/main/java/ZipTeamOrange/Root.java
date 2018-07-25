package ZipTeamOrange;


import ZipTeamOrange.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(path = "/user")
public class Root {

    @GetMapping(path="/")
    public @ResponseBody
    String sayHello(){
        //this returns a JSON or XML with users
        return "Hello";
    }

}
