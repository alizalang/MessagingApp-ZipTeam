
package com.zipteam;

public class ChatController extends Controller{


    private Chat chat;
    private String uri;

    public  String get(User user) {
        return user.toString();
    }
    public String put(User user) {
        return user.toString();
    }

    public String post(User user) {
        return user.toString();
    }

    public String delete(User user) { return user.toString(); }
}
