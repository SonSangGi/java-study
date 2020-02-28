package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 자연수뒤집어배열로만들기 {
	/**
	 * 문제 설명
	 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
	 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 */

	// stream에 의존하지 말자. 너무 느리다.
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		String answer1 = Arrays.toString(solution(919191919));
		long end = System.currentTimeMillis();
		System.out.println((end - begin) / 1000.0 + ": " + answer1);

		begin = System.currentTimeMillis();
		String answer2 = Arrays.toString(solution2(919191919));
		end = System.currentTimeMillis();
		System.out.println((end - begin) / 1000.0 + ": " + answer2);
	}

	public static int[] solution(long n) {
		return Arrays.stream(String.valueOf(n)
				.split(""))
				.mapToInt(Integer::valueOf)
				.sorted().toArray();
	}

	public static int[] solution2(long n) {
		String[] arr = String.valueOf(n).split("");
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			answer[arr.length - 1 - i] = Integer.parseInt(arr[i]);
		}
		return answer;
	}

}
