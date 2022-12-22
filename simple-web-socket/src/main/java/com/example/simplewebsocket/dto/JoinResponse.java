package com.example.simplewebsocket.dto;

public class JoinResponse {

    private String userName;

    public JoinResponse() {
    }

    public static JoinResponse of(final JoinRequest enterRequest){
        return new JoinResponse(enterRequest.getUserName());
    }

    public JoinResponse(final String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
