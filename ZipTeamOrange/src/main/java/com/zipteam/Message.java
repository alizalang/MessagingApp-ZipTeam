package com.zipteam;

import java.util.Date;

public class Message {
    private int messageId;
    private String text;
    private Date timestamp;
    private int userId;
    private int chatId;

    public Message(){}

    public Message(String text, int userId, int chatId){
        this.text = text;
        this.userId=userId;
        this.chatId=chatId;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getUserId() {
        return userId;
    }

    public int getChatId() {
        return chatId;
    }
}
