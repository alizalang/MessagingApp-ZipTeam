package ZipTeamOrange.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/message")
@CrossOrigin
public class MessageController {
    ObjectMapper ob = new ObjectMapper();

    @Autowired
    private MessageRepository messageRepository;
    @PostMapping(path = "/add")
    public String postMessage(@RequestBody Message message) throws JsonProcessingException {

        messageRepository.save(message);

        return ob.writeValueAsString(message);

    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Message> getAllMessages(){
        return messageRepository.findAll();
    }


}
