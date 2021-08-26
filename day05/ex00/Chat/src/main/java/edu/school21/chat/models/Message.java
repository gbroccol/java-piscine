package edu.school21.chat.models;

import java.util.Date;
import java.util.Objects;

public class Message {
    private Long            messageId;
    private Integer         authorId;
    private Integer         chatroomId;
    private String          text;
    private Date            date;

    private User            author;
    private Chatroom        chatroom;

    public Message(Long messageId, Integer authorId, Integer chatroomId, String text, Date date, User author, Chatroom chatroom) {
        this.messageId = messageId;
        this.authorId = authorId;
        this.chatroomId = chatroomId;
        this.text = text;
        this.date = date;
        this.author = author;
        this.chatroom = chatroom;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(Integer chatroomId) {
        this.chatroomId = chatroomId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return messageId.equals(message.messageId) && authorId.equals(message.authorId) && chatroomId.equals(message.chatroomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, authorId, chatroomId);
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", authorId=" + authorId +
                ", chatroomId=" + chatroomId +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}