package dev.sanggi.programmers.level1;

import java.util.stream.LongStream;

public class 두정수사이의합 {
	public static void main(String[] args) {

		long a = solution(-5, 6);

		System.out.println(a);

	}

	public static long solution(int a, int b) {
		return LongStream.range(a > b ? b : a, a > b ? a + 1 : b + 1).sum();
	}

}
