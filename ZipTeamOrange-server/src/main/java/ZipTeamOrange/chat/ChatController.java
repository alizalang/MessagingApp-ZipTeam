package ZipTeamOrange.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/chat")
@CrossOrigin(origins = {"http://localhost:8103"})
public class ChatController {

    @Autowired
    private ChatRepository chatRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    Chat addNewChat(@RequestBody Chat chat){
        chatRepository.save(chat);
        return  chat;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Chat> getAllChat() {
        //this returns a JSON or XML with chats
        return chatRepository.findAll();

    }
}
