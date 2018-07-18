package ZipTeamOrange.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/chat")
public class ChatController {

    @Autowired
    private ChatRepository chatRepository;

    @PostMapping(path="/add")
    @CrossOrigin(origins = {"http://localhost:8103"})
    public @ResponseBody
    String addNewChat(@RequestBody Chat chat){
        chatRepository.save(chat);
        return  "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Chat> getAllChat(){
        //this returns a JSON or XML with chats
        return chatRepository.findAll();
    }

}
