package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로정렬하기 {
	public static void main(String[] args) {
		System.out.println(solution(18833049));
	}

	public static long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr,Collections.reverseOrder());
		return Long.valueOf(String.join("",arr));
	}
}
