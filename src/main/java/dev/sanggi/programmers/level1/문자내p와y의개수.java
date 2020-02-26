package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 문자내p와y의개수 {
	public static void main(String[] args) {
		System.out.print(solution("pPoooyY"));
	}
	public static boolean solution(String s) {
		long p = Arrays.stream(s.split("")).filter(str -> str.toUpperCase().equals("P")).count();
		long y = Arrays.stream(s.split("")).filter(str -> str.toUpperCase().equals("Y")).count();
		return p == y;
	}
}
