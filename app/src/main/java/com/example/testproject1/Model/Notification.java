package com.example.testproject1.Model;

public class Notification {
    String receiverId, senderId, text, data;

    public Notification() {
    }

    public Notification(String receiverId, String senderId, String text, String data) {
        this.receiverId = receiverId;
        this.senderId = senderId;
        this.text = text;
        this.data = data;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
