package dev.sanggi.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
public class MyFirstServer extends Thread {

	MyFirstServer() {
		this.setName("server-thread");
	}


	private final static int BIND_PORT = 9000;

	public void run() {

		/**
		 * new ServerSocket(포트번호) 입력 시
		 * ServerSocket serverSocket = new ServerSocket();
		 * serverSocket.bind(new InetSocketAddress(포트번호));
		 * 위의 로직이 실행된다.
		 *
		 * 특정 IP만 연결할 수 있는 방법은
		 * new InetSocketAddress("아이피번호",포트번호);
		 * 위 InetSocketAddress로 바인드 한다.
		 *
		 * 포트 사용중일 시 BindExcention 예외 발생
		 */
		try (ServerSocket server = new ServerSocket(BIND_PORT)) {
				log.info("** START SOCKET SERVER !PORT [" + BIND_PORT + "]");
			while (true) {
				// 클라이언트 연결 요청 전까지 블로킹
				// 블로킹 = 스레드 대기 상태
				Socket socket = server.accept();
				log.info("** SERVER -> CLIENT CONNECT [" + socket.getInetAddress().getHostAddress() + "]");

				// 클라이언트에서 보낸 데이터를 받아오는 inputStream
				InputStream input = socket.getInputStream();
				// inputStream은 데이터를 byte 배열로 읽는다.
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);

				log.info(br.readLine());

				OutputStream out = socket.getOutputStream();
				out.write("Hello World!".getBytes());
				out.flush();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
