package dev.sanggi.programmers.level1;

import java.util.stream.IntStream;

public class 약수의합 {
	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	public static int solution(int n) {
		return IntStream.range(1,n + 1)
			.filter(i -> n % i == 0)
			.sum();
	}
}
