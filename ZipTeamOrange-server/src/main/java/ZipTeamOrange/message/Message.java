package ZipTeamOrange.message;

import ZipTeamOrange.chat.Chat;
import ZipTeamOrange.user.User;
import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String message;
    @ManyToOne
    @JoinColumn(name="user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    public Message(String message, User user) {
        this.message = message;
        this.user = user;
    }

    public Message(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
