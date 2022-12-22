package com.example.simplewebsocket.dto;


public class JoinRequest {

    private String userName;

    public JoinRequest(){

    }

    public JoinRequest(final String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
