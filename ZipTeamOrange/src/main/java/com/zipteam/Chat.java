<<<<<<< HEAD:ZipTeamOrange/src/main/java/com/zipteam/Chat.java
package com.zipteam;

=======
>>>>>>> 6a0f92fbf58b2aaee9c06fdf6f5e75c39a426217:ZipTeamOrange/src/main/java/Chat.java
import java.util.HashMap;
import java.util.HashSet;

public class Chat {
    private int chatId;
    private String name;
    private boolean isChannel;
    private boolean isPublic;
    private int creatorId;
    private HashSet<User> users = new HashSet<User>();
    private HashMap<String, Message> messages = new HashMap<String, Message>();

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

    public int getCreatorId() {
        return creatorId;
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public HashMap<String, Message> getMessages() {
        return messages;
    }
}
