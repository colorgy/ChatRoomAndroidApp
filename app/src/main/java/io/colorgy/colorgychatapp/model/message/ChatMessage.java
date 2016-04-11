package io.colorgy.colorgychatapp.model.message;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by erwaiyang on 2016/4/11.
 */
public class ChatMessage {

    public static HashMap<String, String> MESSAGE_TYPE;
    public static HashMap<String, String> CONTENT_KEY;
    static {
        MESSAGE_TYPE.put("TEXT", "text");
        MESSAGE_TYPE.put("IMAGE", "image");
        MESSAGE_TYPE.put("STICKER", "sticker");

        CONTENT_KEY.put("TEXT", "text");
        CONTENT_KEY.put("IMAGE", "image");
        CONTENT_KEY.put("STICKER", "stickerId");
    }

    private String id;
    private String type;
    private String content;
    private String userId;
    private TimeStamp createdAt;
    private int chatProgress;

    public ChatMessage(JSONObject json) throws JSONException{
        this.id = json.getString("id");
        this.type = json.getJSONObject("data").getString("type");
        if(this.type.equals(ChatMessage.MESSAGE_TYPE.get("TEXT"))){
            this.content = json.getJSONObject("data").getJSONObject("content").getString(ChatMessage.CONTENT_KEY.get("TEXT"));
        } else if(this.type.equals(ChatMessage.MESSAGE_TYPE.get("IMAGE"))){
            this.content = json.getJSONObject("data").getJSONObject("content").getString(ChatMessage.CONTENT_KEY.get("IMAGE"));
        } else if(this.type.equals(ChatMessage.MESSAGE_TYPE.get("STICKER"))){
            this.content = json.getJSONObject("data").getJSONObject("content").getString(ChatMessage.CONTENT_KEY.get("STICKER"));
        }
        this.userId = json.getJSONObject("data").getString("userId");
        this.createdAt = new TimeStamp ( json.getJSONObject("data").getString("createdAt") );
        this.chatProgress = json.getJSONObject("data").getInt("chatProgress");
    }

}
