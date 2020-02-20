package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 평균값구하기 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4}));
	}

	public static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}

}
