package com.pradeip.poc.stock.fyres;

import com.tts.in.model.FyersClass;

public class AuthCode {

    public static void main(String[] args) {
        String appid = "";
        String redirectURI = "";

        FyersClass fyersClass = FyersClass.getInstance();
        fyersClass.clientId = appid;
        AuthCode app = new AuthCode();
        app.getGenerateCode(redirectURI, fyersClass);
    }

    public void getGenerateCode(String redirectURI, FyersClass fyersClass) {
        fyersClass.GenerateCode(redirectURI);
    }
}