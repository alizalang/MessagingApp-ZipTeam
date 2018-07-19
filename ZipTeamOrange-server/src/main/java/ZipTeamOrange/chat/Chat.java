package ZipTeamOrange.chat;

import ZipTeamOrange.message.Message;
import ZipTeamOrange.user.User;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "chat")
    private Set<Message> messages;

    @ManyToMany(mappedBy = "chat")
    private Set<User> users;

    public Chat(String name, Set<User> users) {
        this.name = name;
        this.users = users;
    }

    public Chat(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
