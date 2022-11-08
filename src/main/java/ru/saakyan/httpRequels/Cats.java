package ru.saakyan.httpRequels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public Cats(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Факт:" +
                "\n Идентификационный номер: " + id +
                "\n Сообщение: " + text +
                "\n Тип животного: " + type +
                "\n Имя пользователя: " + user +
                "\n Голоса: " + upvotes +
                "\n";
    }
}