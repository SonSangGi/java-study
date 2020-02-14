package dev.sanggi.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;

@Slf4j
public class MyFirstClient extends Thread {

	MyFirstClient() {
		this.setName("client-thread");
	}

	public void run() {
		try (Socket socket = new Socket("localhost", 9000)) {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

			log.info("** CLIENT -> SERVER CONNECT [ " + socket.toString() + "]");
			String data = in2.readLine();
			out.println(data); //서버로 데이터 전송
			out.flush();

			String str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
