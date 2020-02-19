package dev.sanggi.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 같은숫자는싫어 {
	public static void main(String[] args) {
		Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
		System.out.println(Arrays.toString(solution2(new int[]{1, 1, 3, 3, 0, 1, 1})));
	}

	public static int[] solution(int[] arr) {
		return Arrays.stream(arr)
				.mapToObj(Integer::valueOf)
				.collect(Collectors.toSet()).stream()
				.mapToInt(i -> i)
				.toArray();
	}

	public static int[] solution2(int[] arr) {
		return IntStream.range(0,arr.length)
				.filter(i -> (i == 0 ? -1 : arr[i - 1] ) != arr[i])
				.map(i -> arr[i])
				.toArray();
	}
}
