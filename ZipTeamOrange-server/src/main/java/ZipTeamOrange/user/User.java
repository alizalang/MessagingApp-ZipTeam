package ZipTeamOrange.user;

import ZipTeamOrange.chat.Chat;
import ZipTeamOrange.message.Message;
import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="ChatUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<Message> messages;
    @ManyToMany
    @JoinTable(
            name = "USER_CHAT",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "chat_id") }
    )
    private Set<Chat> chat;


    public User() {
    }


    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
