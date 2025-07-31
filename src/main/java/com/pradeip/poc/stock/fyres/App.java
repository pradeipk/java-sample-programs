package com.pradeip.poc.stock.fyres;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.tts.in.model.FyersClass;
import com.tts.in.websocket.FyersSocket;
import com.tts.in.websocket.FyersSocketDelegate;

import in.tts.hsjavalib.ChannelModes;

public class App implements FyersSocketDelegate {

	public static void main(String[] args) {

		String script = "";
		String APPID = "";
		String LiveToken1 = "";
		// String script = args.length > 0 ? args[0] : "NSE:SBIN-EQ";
		// String LiveToken = args.length > 1 ? args[1] : LiveToken1;
		try {
		String jarDir = new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
		System.out.println("Jar Directory: " + jarDir);
		// Specify the file name
		String fileName = "input.txt"; // Replace with your file name
		// Construct the file path
		Path filePath = null;
		
			filePath = Paths.get(jarDir,fileName); // Paths.get(jarDir, fileName);
			List<String> lines = Files.readAllLines(filePath);
			script = lines.get(0).trim(); // Read the first line as script
			LiveToken1 = lines.get(1).trim(); // Read the second line as LiveToken
		} catch (IOException e) {

			System.out.println("Error reading file: " + e.getMessage());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FyersClass fyersClass = FyersClass.getInstance();
		fyersClass.clientId = APPID;
		fyersClass.accessToken = LiveToken1;
		App app = new App();
		app.WebSocket(script);
	}

	public void WebSocket(String script) {
		List<String> scripList = new ArrayList<>();
		scripList.add(script);
		FyersSocket fyersSocket = new FyersSocket(3);
		fyersSocket.webSocketDelegate = this;
		fyersSocket.ConnectHSM(ChannelModes.LITE);
		fyersSocket.SubscribeData(scripList);
	}

	@Override
	public void OnIndex(JSONObject index) {
		System.out.println("On Index: " + index);
	}

	@Override
	public void OnScrips(JSONObject scrips) {
		System.out.println("On Scrips: " + scrips);
	}

	@Override
	public void OnDepth(JSONObject depths) {
		System.out.println("On Depth: " + depths);
	}

	@Override
	public void OnOrder(JSONObject orders) {
		System.out.println("On Orders: " + orders);
	}

	@Override
	public void OnTrade(JSONObject trades) {
		System.out.println("On Trades: " + trades);
	}

	@Override
	public void OnPosition(JSONObject positions) {
		System.out.println("On Positions: " + positions);
	}

	@Override
	public void OnOpen(String status) {
		System.out.println("On open: " + status);
	}

	@Override
	public void OnClose(String status) {
		System.out.println("On Close: " + status);
	}

	@Override
	public void OnError(JSONObject error) {
		System.out.println("On Error: " + error);
	}

	@Override
	public void OnMessage(JSONObject message) {
		System.out.println("OnMessage: " + message);
	}

}