package dev.sanggi.programmers.level1;

import java.util.Arrays;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String a = solution(new String[]{"Jane", "Kim"});
		System.out.println(a);
	}

	public static String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++)
			if (seoul[i].equals("Kim")) return "김서방은 " + i + "에 있다";
		return null;
	}

}
