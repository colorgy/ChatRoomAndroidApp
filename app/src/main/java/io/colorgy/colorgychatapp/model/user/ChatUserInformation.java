package io.colorgy.colorgychatapp.model.user;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by erwai on 4/15/16.
 */
public class ChatUserInformation {
    private String id;
    private String uuid;
    private String status;
    private String gender;
    private String aboutHoroscope;
    private String aboutSchool;
    private String aboutHabitancy;
    private String aboutConversation;
    private String aboutPassion;
    private String aboutExpertise;
    private String lastAnsweredDate;
    private String lastAnswer;
    private String avatarBlur2xUrl;
    private String organizationCode;

    public ChatUserInformation(JSONObject json) throws JSONException{
        this.id = json.getString("id");
        this.uuid = json.getString("uuid");
        this.status = json.getString("status");
        this.gender = json.getString("gender");

        JSONObject aboutObject = json.getJSONObject("about");

        this.aboutHoroscope = aboutObject.getString("horoscope");
        this.aboutSchool = aboutObject.getString("school");
        this.aboutHabitancy = aboutObject.getString("habitancy");
        this.aboutConversation = aboutObject.getString("conversation");
        this.aboutPassion = aboutObject.getString("passion");
        this.aboutExpertise = aboutObject.getString("expertise");

        this.lastAnsweredDate = json.getString("lastAnsweredDate");
        this.lastAnswer = json.getString("lastAnswer");
        this.avatarBlur2xUrl = json.getString("avatar_blur_2x_url");
        this.organizationCode = json.getString("organization_code");
    }g
}
