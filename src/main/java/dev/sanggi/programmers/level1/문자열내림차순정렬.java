package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순정렬 {

	public static void main(String[] args) {
		System.out.println(solution("gfedcbZ"));
	}

	public static String solution(String s) {
		return Arrays.stream(s.split(""))
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.joining());
	}
}
