package dev.sanggi.socket;

public class Main {
	public static void main(String[] args) {
		MyFirstServer server = new MyFirstServer();
		MyFirstClient client = new MyFirstClient();

		server.start();
		client.start();
	}
}
