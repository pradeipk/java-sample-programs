package com.pradeip.poc.stock.fyres;

import org.json.JSONObject;
import com.tts.in.model.FyersClass;

public class RefreshToken {

	public static void main(String[] args) {
		String APPID = "";
		String code = "";
		String appHashId = "";

		FyersClass fyersClass = FyersClass.getInstance();
		fyersClass.clientId = APPID;
		RefreshToken app = new RefreshToken();
		app.GetGenerateToken(code, appHashId, fyersClass);
	}

	public void GetGenerateToken(String code, String appHashId, FyersClass fyersClass) {
		JSONObject jsonObject = fyersClass.GenerateToken(code, appHashId);
		System.out.println(jsonObject);

	}
}