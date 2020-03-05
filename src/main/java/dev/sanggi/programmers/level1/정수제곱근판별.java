package dev.sanggi.programmers.level1;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		System.out.println(solution(121));
	}

	public static long solution(long n) {

		double i = Math.sqrt(n);

		return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
	}
}
