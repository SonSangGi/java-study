package dev.sanggi.programmers.level2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 왜 테스트케이스에서 통과 못할까..
public class n진수 {
	public static void main(String[] args) {
		String a = solution(2, 1000, 100, 3);
		System.out.println(a);
	}

	/**
	 * @param n 진법
	 * @param t 미리 구할 숫자의 숫자의 갯수
	 * @param m 게임에 참가하는 인원
	 * @param p 튜브의 순서
	 * @return
	 */
	public static String solution(int n, int t, int m, int p) {

		String binary = IntStream.range(0, t * m)
				.mapToObj(i -> n == 16 ? String.format("%X", i) : Integer.toBinaryString(i))
				.collect(Collectors.joining());

		System.out.println(binary);

		String answer = "";
		for (int i = 1; i < t * m + 1; i++) {
			int mm = i % m == 0 ? m : i % m;
			System.out.println(i + ") " + mm + ": " + binary.charAt(i - 1));
			if (mm == p)
				answer += binary.charAt(i - 1);

		}
		return answer;
	}
}
