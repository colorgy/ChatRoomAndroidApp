package io.colorgy.colorgychatapp.model.message;

import org.json.JSONException;
import org.json.JSONObject;

public class Chatroom {
    private String chatroomId;
    private String socketId;
    private int totalMessageLength;
    private int chatProgress;
    private boolean moreMessage;
    private String targetAlias;

    public String getOtherNickName() {
        return otherNickName;
    }

    public String getOtherProfileImage() {
        return otherProfileImage;
    }

    private String otherNickName;
    private String targetImage;
    private String otherProfileImage;

    public Chatroom(JSONObject json) throws JSONException{
        this.chatroomId = json.getString("chatroomId");
        this.socketId = json.getString("socketId");
        this.totalMessageLength = json.getInt("totalMessageLength");
        this.chatProgress = json.getInt("chatProgress");
        this.moreMessage = json.getBoolean("moreMessage");
        this.targetAlias = json.getString("targetAlias");
        this.targetImage = json.getString("targetImage");
    }

    public Chatroom(String chatroomId, String socketId, int totalMessageLength, int chatProgress, boolean moreMessage, String targetAlias, String targetImage){
        this.chatroomId = chatroomId;
        this.socketId = socketId;
        this.totalMessageLength = totalMessageLength;
        this.chatProgress = chatProgress;
        this.moreMessage = moreMessage;
        this.targetAlias = targetAlias;
        this.targetImage = targetImage;
    }
}
