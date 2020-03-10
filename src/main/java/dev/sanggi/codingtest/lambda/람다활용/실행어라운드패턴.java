package dev.sanggi.codingtest.lambda.람다활용;


import java.io.*;
import java.util.stream.Collectors;

public class 실행어라운드패턴 {

	public static void main(String[] args) throws IOException {

		/**
		 * 자원처리에 사용되는 순환패턴은 자원을 열고, 처리한 다음 닫는 순서로 이루어진다.
		 * 초기화/준비코드 -> 작업 -> 정리/마무리 코드
		 * 위와 같은 형식의 코드를 실행 어라운드 패턴이라고 한다.
		 */
		String lines = processFile();

		System.out.println(lines);
	}

	public static String processFile() throws IOException {

		// 자바 7에 추가된 with-resources 구문 - 자원을 명시적으로 닫을 필요 없음
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

			return br.lines().collect(Collectors.joining());

		}
	}
}
