package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		String ex1 = Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5));
		String ex2 = Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1));
		String ex3 = Arrays.toString(solution(new int[]{3, 2, 6}, 10));
		System.out.println("기대값: [5, 10] 결과값" + ex1);
		System.out.println("기대값: [1, 2, 3, 36] 결과값" + ex2);
		System.out.println("기대값: [-1] 결과값" + ex3);

	}

	public static int[] solution(int[] arr, int divisor) {

		int[] answer = Arrays.stream(arr)
				.filter(i -> i % divisor == 0)
				.sorted()
				.toArray();

		return answer.length > 0 ? answer : new int[]{-1};
	}
}
