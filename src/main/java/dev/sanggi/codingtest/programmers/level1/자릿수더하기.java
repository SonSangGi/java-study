package dev.sanggi.codingtest.programmers.level1;

import java.util.Arrays;

public class 자릿수더하기 {

	/**
	 * 문제 설명
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	 *
	 * 제한사항
	 * N의 범위 : 100,000,000 이하의 자연수
	 *
	 * 입출력 예
	 * N	answer
	 * 123	6
	 * 987	24
	 *
	 * 입출력 예 설명
	 * 입출력 예 #1
	 * 문제의 예시와 같습니다.
	 *
	 * 입출력 예 #2
	 * 9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
	 */

	// 일반 반복문과 stream의 성능 차이가 심하다.
	// stream을 남발해선 안되겠다.
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int answer1 = solution(919191919);
		long end = System.currentTimeMillis();
		System.out.println((end - begin) / 1000.0 + ": " + answer1);

		begin = System.currentTimeMillis();
		int answer2 = solution2(919191919);
		end = System.currentTimeMillis();
		System.out.println((end - begin) / 1000.0 + ": " + answer2);
	}

	// stream 사용
	public static int solution(int n) {
		return Arrays.stream(String.valueOf(n).split(""))
				.mapToInt(Integer::parseInt)
				.sum();
	}

	// 향상 for문 사용
	public static int solution2(int n) {
		final String[] arr = String.valueOf(n).split("");
		int answer = 0;

		for (String s : arr)
			answer += Integer.parseInt(s);

		return answer;
	}
}
