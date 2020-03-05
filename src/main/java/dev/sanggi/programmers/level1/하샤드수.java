package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 하샤드수 {
	public static void main(String[] args) {
		System.out.println(solution(11));
	}

	public static boolean solution(int x) {
		if (x > 9) {
			int sum = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
			if (x % sum == 0) return true;
		} else if (x % (x / 2) == 0) {
			return true;
		}
		return false;
	}
}
