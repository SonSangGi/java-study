package dev.sanggi.programmers.level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		String s = solution(15);
		System.out.println(s);
	}

	/**
	 * 문제 설명
	 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
	 * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
	 *
	 * 제한 조건
	 * n은 길이 10,000이하인 자연수입니다.
	 * 입출력 예
	 * n	return
	 * 3	수박수
	 * 4	수박수박
	 * @param n
	 * @return
	 */
	public static String solution(int n) {
		return IntStream.range(0,n).mapToObj(i -> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());
	}
}
