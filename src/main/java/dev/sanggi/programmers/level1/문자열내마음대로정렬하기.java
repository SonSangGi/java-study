package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] array = solution(new String[]{"abce", "abcd", "cdx"}, 1);
		for (String s : array) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[] strings, int n) {
		return Arrays.stream(strings)
				.sorted(Comparator.naturalOrder())
				.sorted(Comparator.comparingInt(o -> o.charAt(n)))
				.toArray(String[]::new);
	}
}
