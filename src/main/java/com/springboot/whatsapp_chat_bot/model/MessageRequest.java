package com.springboot.whatsapp_chat_bot.model;

public class MessageRequest {
    private String message;
    private String sender;

    public MessageRequest() {
    }

    public MessageRequest(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
