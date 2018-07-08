import java.util.ArrayList;
import java.util.HashSet;

public class Chat {
    int chatId;
    String name;
    boolean isChannel;
    boolean isPublic;
    int creatorId;
    HashSet<User> users = new HashSet<User>();
    ArrayList<Message> messages = new ArrayList<Message>();

    public Chat(){}

    public Chat(String name){
        this.name = name;
    }

    public Chat(int chatId, String name, boolean isChannel, boolean isPublic){
        this.chatId = chatId;
        this.name = name;
        this.isChannel = isChannel;
        this.isPublic = isPublic;
    }

    public int getChatId() {
        return chatId;
    }

    public String getName() {
        return name;
    }

    public boolean isChannel() {
        return isChannel;
    }

    public boolean isPublic() {
        return isPublic;
    }
}
