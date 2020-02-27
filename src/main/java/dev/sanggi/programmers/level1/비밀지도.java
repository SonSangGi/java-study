package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 비밀지도 {
	public static void main(String[] args) {
		solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] map = new String[n];

		for (int i = 0; i < n; i++) {
			String binary1 = Integer.toBinaryString(arr1[i]);
			String binary2 = Integer.toBinaryString(arr2[i]);
			while (binary1.length() < n) binary1 = "0" + binary1;
			while (binary2.length() < n) binary2 = "0" + binary2;

			map[i] = "";
			for (int j = 0; j < n; j++) {
				map[i] += binary1.charAt(j) == '0' && binary2.charAt(j) == '0' ? " " : "#";
			}
		}
		return map;
	}
}
