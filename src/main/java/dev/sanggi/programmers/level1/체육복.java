package dev.sanggi.programmers.level1;

import java.util.*;
import java.util.stream.IntStream;

public class 체육복 {

	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
	}

	/**
	 * 전체 학생의 수 n
	 * , 체육복을 도난당한 학생들의 번호가 담긴 배열 lost
	 * , 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때
	 * , 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	 *
	 * @param n       전체 학생의 수
	 * @param lost    체육복을 도난당한 학생들의 번호가 담긴 배열
	 * @param reserve 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
	 * @return 체육수업을 들을 수 있는 학생의 최댓값
	 */
	public static int solution(int n, int[] lost, int[] reserve) {

		// 중복 제거
		IntStream.range(0, lost.length)
				.forEach(i -> IntStream.range(0, reserve.length)
						.filter(j -> lost[i] == reserve[j])
						.forEach(j -> lost[i] = reserve[j] = -1));

		int reserveTemp = -1;// 이미 빌려줬는지 알기 위한 reserveTemp
		int reserveCount = 0, lostCount = 0;

		for (int i : lost) {
			if (i < 0) continue; // 중복일 경우
			lostCount++;
			for (int j : reserve) {
				if (j < 0 || reserveTemp == j) continue; // 중복일 경우 or 이미 빌려 줬을 경우
				if (i - 1 == j || i + 1 == j) {
					reserveCount++;
					reserveTemp = j;
					break;
				}
			}
		}
		return n - (lostCount - reserveCount);
	}
}
