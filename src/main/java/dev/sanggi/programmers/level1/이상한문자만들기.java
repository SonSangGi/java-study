package dev.sanggi.programmers.level1;


import net.jpountz.xxhash.XXHash32;

import java.util.concurrent.atomic.AtomicInteger;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		System.out.println(solution("abc DDdda BCddr"));
	}

	public static String solution(String s) {

		char[] chars = s.toCharArray();
		int idx = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ')
				idx = 0;
			else
				chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
		}

		return String.valueOf(chars);
	}

}
