package dev.sanggi.codingtest.programmers.level1;

import java.util.Arrays;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 *
 * 입출력 예
 * arr	divisor	return
 * [5, 9, 7, 10]	5	[5, 10]
 * [2, 36, 1, 3]	1	[1, 2, 3, 36]
 * [3,2,6]	10	[-1]
 */
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
