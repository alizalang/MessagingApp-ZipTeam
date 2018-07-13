package com.zipteam;

public class MessageController extends Controller{

    private Message message;
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
