package io.colorgy.colorgychatapp.model.user;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by erwai on 4/15/16.
 */
public class ChatUser {
    private String userId;
    private String status;

    public ChatUser(JSONObject json) throws JSONException{
        this(json.getString("userId"), json.getString("status"));
    }

    public ChatUser(String userId, String status){
        this.userId = userId;
        this.status = status;
    }
}
