package com.example.exex;

import com.google.gson.annotations.SerializedName;

public class Post {
    private String agentld;
    private int id;

    private String text;

    @SerializedName("msg")
    private String text_msg;

    public String getAgentld() {
        return agentld;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getText_msg() {
        return text_msg;
    }
}
