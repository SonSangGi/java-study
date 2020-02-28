package dev.sanggi.programmers.level1;

public class 짝수와홀수 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	/**
	 * 문제 설명
	 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
	 */
	public static String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}
