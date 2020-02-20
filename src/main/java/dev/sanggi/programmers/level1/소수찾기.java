package dev.sanggi.programmers.level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 소수찾기 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		System.out.println("RESULT : " + solution(1000));
		System.out.println("RESULT2 : " + solution2(1000));

		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println("실행 시간 : " + (end - start) / 1000.0);
	}

	public static int solution(int n) {
		return IntStream.range(2, n + 1)
				.filter(i -> {
					for (int j = 2; j < i; j++)
						if (i % j == 0) return false;
					return true;
				}).toArray().length;
	}

	public static int solution2(int n) {
		int result = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(i);
				}
			}
		}
		return result;
	}
}
